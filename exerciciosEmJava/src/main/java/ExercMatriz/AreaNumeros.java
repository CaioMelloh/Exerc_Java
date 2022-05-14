/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercMatriz;

/**
 *
 * @author caioh
 */
public class AreaNumeros {

    public void mostrar(int vetor[][], int x, int colunas, int linhas, int i, int j) {
                System.out.println("Position " + i + "," + j);
                    if (j!= 0)
                        System.out.println("Left:" + vetor[i][j - 1]);
                    if(j < colunas - 1)
                        System.out.println("Right: " + vetor[i][j+1]);
                    if(i != 0)
                        System.out.println("Up:" + vetor[i-1][j]);
                    if(i < linhas-1)
                        System.out.println("Below:" + vetor[i+1][j]);
                    System.out.println();
                }
            }

