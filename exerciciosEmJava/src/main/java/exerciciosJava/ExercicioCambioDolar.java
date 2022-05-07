/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exerciciosJava;

/**
 *
 * @author caioh
 */
public class ExercicioCambioDolar {
    public double dolar;
    public double reais;
    public static double iof = 0.06;

    public static double converter(double c, double d) {
        double valor = (c * d);
        return valor += iof * valor;
    }
}
    
