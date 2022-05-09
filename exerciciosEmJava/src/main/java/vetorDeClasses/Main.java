/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorDeClasses;

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
        Scanner fg = new Scanner(System.in);
        int n = fg.nextInt();
        Produtos[] vect = new Produtos[n];
        double soma = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Preco: ");
            double preco = fg.nextDouble();
            fg.nextLine();
            System.out.print("Nome: ");
            String nome = fg.nextLine();
            vect[i] = new Produtos(nome, preco);
            /*instanciando objeto e usando 
            construtor para fazê-lo com seus atributos;*/
        }

        for (Produtos vect1 : vect) {
            soma += vect1.getPreco();
        }

        soma /= n;

        for (Produtos vectt : vect) {
            System.out.print(vectt.toString() + "||");
        }

        System.out.printf("A soma é: %.2f", soma);
        System.out.println();

        fg.close();
    }
    
}
