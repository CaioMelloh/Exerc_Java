/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package excecoes;

/**
 *
 * @author caioh
 */
public class Exception {

    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
        
        System.out.println("ANtes da exception!");
        
        System.out.println(vetor[4]);
        
        System.out.println("Esse texto não será impresso!!");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("O usuário digitou um índice inexistente no vetor");
        }
        System.out.println("Tudo foi apresentado de forma mais amistosa");
    }
}
