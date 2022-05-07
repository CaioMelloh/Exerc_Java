/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConstrutorEncapsulamento;

import java.util.Locale;
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
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        ContaBanco conta; /* é necessário adicionar a variavel do tipo conta banco*/
        Scanner fg = new Scanner(System.in); /*pois a mesma permite que os objetos instan*/
        System.out.print("Enter account number: "); /* ciados no if não sejam apenas locais*/
        int numb = fg.nextInt();
        fg.nextLine();
        System.out.print("Enter account holder: ");
        String name = fg.nextLine();
        System.out.print("Is there a initial deposit? (y/n)");
        char resp = fg.next().charAt(0);
        
        if(resp == 'y'){
            System.out.print("Enter a inital deposit value: ");
            double valor = fg.nextDouble();
            conta = new ContaBanco(numb, name, valor);
            conta.toString();
        }
        else{
            conta = new ContaBanco(numb, name);
            System.out.println(conta.toString());
        }
        
        System.out.print("Enter a deposit value: ");
        conta.depositar(fg.nextDouble());
        System.out.println(conta.toString());
        
        System.out.print("Enter a withdraw value: ");
        conta.sacar(fg.nextDouble());
        System.out.println(conta.toString());
        
       
        
        
        
        
        
       
     
        
        
        
        
        
        
        fg.close();
        
    }
    
}
