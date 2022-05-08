/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjetoLetrinhas;

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
      Scanner fg = new Scanner(System.in);
      int x;
      ModificaLetrinhas play1 = new ModificaLetrinhas();
      do{
          System.out.println("Write your name and let´s play!");
          String name = fg.nextLine();
          System.out.println("How do you prefer your name? (example / EXAMPLE) = (1/2)");
          int resp = fg.nextInt();
          switch (resp) {
              case 1:
                  play1.LowerCase(name);
                  break;
              case 2:
                  play1.Uppercase(name);
                  break;
              default:
                  System.out.println("You shall not pass!");
                  break;
            }
       System.out.print("Gostaria de repetir? (0 = y/ others = n)");
       x = fg.nextInt();
       fg.nextLine();
       
        }while(x == 0);
       
      
        fg.close();
    }
    
}
