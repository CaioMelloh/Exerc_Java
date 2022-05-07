/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstrutorEncapsulamento;

/**
 *
 * @author caioh
 */
public class ContaBanco {
   private int numeroDaConta;
   private String nomeTitular;
   private double valorInicial;
   private double saldo;
   
  
   
   public double depositar(double deposito){
       saldo += deposito;
       return saldo;
   }
   
   public double sacar(double vlr){
       saldo-= (vlr + 5.00);
       return saldo;
   }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

   public double getSaldo(){
       return saldo;
   }
    
   
   public ContaBanco(){
       
   }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
   

    public ContaBanco(int numeroDaConta, String nomeTitular, double valorInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.valorInicial = valorInicial;
    }

    public ContaBanco(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Account: " + getNumeroDaConta() + ", " + "Holder: " +
        getNomeTitular() + ", " + "Balance: $ " + String.format("%.2f", getSaldo());
    }
     
}
