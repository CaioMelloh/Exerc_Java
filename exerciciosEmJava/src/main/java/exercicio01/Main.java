/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author caioh
 */
public class Main {
    public static void main(String[] args){
        Scanner fg = new Scanner(System.in);
        double dolar, cotacao;
        dolar = fg.nextDouble();
        cotacao = fg.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f",
        ExercicioCambioDolar.converter(cotacao, dolar));

        fg.close();
    }
}
