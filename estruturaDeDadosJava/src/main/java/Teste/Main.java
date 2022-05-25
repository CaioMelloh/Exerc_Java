/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teste;

import com.mycompany.estruturadedadosjava.Vetor;

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
       Vetor vetor = new Vetor(10); //10 posições
      try{
          vetor.adiciona("O");
          vetor.adiciona("g");
      }
      catch(Exception e){
          System.out.println(e.getMessage());
          e.printStackTrace();
      }
      System.out.println(vetor.tamanho());
      System.out.print(vetor.toString());    // não é necessário adicionar o vetor.toString();
      //entretanto, note que o tamanho e a capacidade são coisas diferentes. 
        
    }
    
}
