/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alturaMedia;

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
        System.out.println("Digite o numero de pessoas que serão lidas: ");
        int n = fg.nextInt();
        double[] alturas = new double[n];
        double soma = 0;
        
        for(int i = 0; i<n; i++){
            System.out.println("Digite a altura: ");
            double d = fg.nextDouble();
            alturas[i] = d; /* inserindo valor d no endereço de indice 0*/
        }
   
        for(int i = 0; i<alturas.length; i++){
            soma+= alturas[i]; /*somando alturas*/
        }
        
        soma = soma / n;    
        System.out.printf("Media valores: %.2f\n", soma);
        
        
        
        
        fg.close();
    }
    
}
