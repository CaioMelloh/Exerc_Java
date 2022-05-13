/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melhoriaListaDemissao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caioh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner fg = new Scanner (System.in);
       System.out.println("How many employees will be registered? ");
       int n = fg.nextInt();
       Empregado employee;
       List<Empregado> list = new ArrayList<>();
       double percentage;
       Boss chefe = new Boss();
       int id;
       Empregado fx;
       
       for(int i = 0; i<n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id_e = fg.nextInt();
            fg.nextLine();
            System.out.print("Name: ");
            String name = fg.nextLine();
            System.out.print("Salary: ");
            double salary = fg.nextDouble();
            employee = new Empregado(id_e, name, salary); /*instanciado objeto employee*/
            list.add(employee); /*adicionando a lista*/
            System.out.println();
            
       }
       
       
       System.out.println("Do you'll like to increase the salary of an employee? (y/n)");
       char g = fg.next().charAt(0);
       
        if (g == 'y') {
            System.out.println("Enter the employee id that will be increase: ");
            id = fg.nextInt();
            fx = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            /* funcao lambda*/
            if (fx == null) {
                System.out.println("This id does not exist!!");
            } else {
                System.out.print("Enter the percentage: ");
                percentage = fg.nextDouble();
                fx.increaseSalary(percentage);
            }
       
        }
        else
            System.out.println("Okay, let's go!");
            
      
      
       System.out.println();
       
       for(Empregado x: list){
           System.out.println(x.toString()); /*printando valor que to string retorna*/
       }
       
       System.out.println();
       System.out.println("Você gostaria de demitir alguém? (y/n)");
       char b = fg.next().charAt(0);
       
       int z;
       int pos = 0;
       
       
       
        do {
            if (b == 'y') {
                System.out.println("Digite o id do funcionario que gostaria de demitir: ");
                z = fg.nextInt();

                for (Empregado colec : list) {
                    if (colec.getId() == z) {
                        break; /*caso a posição seja encontrada o laço será quebrado*/
                    } else {
                        pos++;
                    }
                }
                if (pos == list.size()) {
                    System.out.println("Id não foi encontrado no sistema.");
                } else {
                    list = chefe.youAreFired(list, pos);
                }

            } else if (b == 'n') {
                System.out.println("So far so good!");
            } else {
                System.out.println("digite uma resposta válida: ");
                b = fg.next().charAt(0);
            }
        } while ((b != 'y') && (b != 'n'));

       
       for(Empregado colecao: list){
            System.out.println(colecao.toString());
       }
      
       
       
       
       fg.close();
    }
    
}
