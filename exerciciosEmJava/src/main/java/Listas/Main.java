/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

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
       Funcionario employee;
       List<Funcionario> list = new ArrayList<>();
       double percentage;
       
       for(int i = 0; i<n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = fg.nextInt();
            fg.nextLine();
            System.out.print("Name: ");
            String name = fg.nextLine();
            System.out.print("Salary: ");
            double salary = fg.nextDouble();
            employee = new Funcionario(id, name, salary); /*instanciado objeto employee*/
            list.add(employee); /*adicionando a lista*/
            System.out.println();
            
       }
       
       System.out.println("Enter the employee id that will be increase: ");
       int id = fg.nextInt();
       Funcionario fx = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
       /* funcao lambda*/
       if(fx == null){
           System.out.println("This id does not exist!!");
       }
       else{
           System.out.print("Enter the percentage: ");
           percentage = fg.nextDouble();
           fx.increaseSalary(percentage);
           
       }
       System.out.println();
       
       for(Funcionario x: list){
           System.out.println(x.toString()); /*printando valor que to string retorna*/
       }
       
       
       
       fg.close();
    }
    
}
