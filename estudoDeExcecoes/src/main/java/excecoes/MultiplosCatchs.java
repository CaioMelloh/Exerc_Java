/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecoes;

/**
 *
 * @author caioh
 */
public class MultiplosCatchs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {4, 6, 36, 16, 24};
        int[] denom = {2, 3, 0, 2};
        /* esse trecho irá resultar em dois erros, o primeiro:
        não há denominadores o suficiente para formar pares com os nums
        */ /*segundo: divisão por zero, absurdo matemático!!!!!*/
        for(int i= 0; i<numeros.length; i++){
            try{
                 System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
            }
            //catch(ArithmeticException e){
               // System.out.println("O usuário tentou dividir por zero");
                /*porém ainda assim há um erro, o numero de pares para nums e denom é ímpar*/
            //}
            /*catch(ArrayIndexOutOfBoundsException e){
                System.out.println("O numero de denominadores não é o suficiente !");
            }*/
           
             catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um erro");
            }// exceções da mesma família, agrupadas.
            catch(Throwable e){
                System.out.println("Ocorreu um erro!");
            }/* para erros genéricos, entretanto, não é uma boa prática!!!!!!*/
            
           
            
           
            
        }
        
    }
    
}
