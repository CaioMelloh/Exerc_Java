/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetorDeClasses;

/**
 *
 * @author caioh
 */
public class Produtos {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    public Produtos(){
        
    }
    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", " + String.format("%.2f",preco);
    }
    
}
