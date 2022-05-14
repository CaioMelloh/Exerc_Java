/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercMatriz;

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
       System.out.print("Numero de linhas: ");
       int m = fg.nextInt();
       System.out.print("Numero de colunas: ");
       int n = fg.nextInt();
       AreaNumeros area = new AreaNumeros();
       
       int[][] vet = new int[m][n];
       
       for(int i= 0; i<m; i++){
           for(int j= 0; j<n; j++){
               vet[i][j] = fg.nextInt();
           }
       }
       
        for(int i= 0; i<m; i++){
            System.out.println();
           for(int j= 0; j<n; j++){
               System.out.print("||" + vet[i][j]);
           }
       }
        
        System.out.println();
        System.out.print("Digite um numero inteiro que pertença a matriz: ");
        int x =fg.nextInt();
        
        for(int i= 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (x == vet[i][j]) {
                    area.mostrar(vet, x, n, m, i, j);
                    System.out.println();
                    break;
                }
            }
            
        }
       
       fg.close();
        
        
    }
    
}
