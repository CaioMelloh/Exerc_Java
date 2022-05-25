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
       Vetor vetor = new Vetor(2); //quatro posições
      try{
          vetor.adiciona("O");
          vetor.adiciona("g");
          vetor.adiciona("k");
      }
      catch(Exception e){
          System.out.println(e.getMessage());
          e.printStackTrace();
      }
       
   
        
       
        
        
        
    }
    
}
