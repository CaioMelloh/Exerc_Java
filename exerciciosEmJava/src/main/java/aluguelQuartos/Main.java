/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluguelQuartos;

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
       System.out.println("Digite o numero de estudantes que irão alugar: ");
       int n = fg.nextInt();
       Aluguel[] aluguelQuartos = new Aluguel[10]; /* vetor criado*/
       int cont = 0;
     
        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            fg.nextLine();
            System.out.print("Name: ");
            String name = fg.nextLine();
            System.out.print("Email: ");
            String email = fg.nextLine();
            System.out.print("Room: ");
            int room = fg.nextInt();
            if (i != 0) {
                while (room == cont) {
                    System.out.println("Quarto indisponível, digite outro: ");
                    room = fg.nextInt();
                }
            }

            cont = room;
            aluguelQuartos[room] = new Aluguel(name, email, room);
            /* objeto instanciado*/
            System.out.println();
        }
       
       System.out.println();
       
       System.out.println("Busy rooms: ");
       for (Aluguel aluga: aluguelQuartos){
           if(aluga!= null){
                System.out.println(aluga.toString());
                System.out.println();
           }
       }
       
       
       fg.close();
       
    }
    
}
