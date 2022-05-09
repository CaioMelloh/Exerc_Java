/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguelQuartos;

/**
 *
 * @author caioh
 */
public class Aluguel {
    private String nome;
    private String email;
    private int numQuarto;
    
    public Aluguel(){
        
    }
    public Aluguel(String nome, String email, int numQuarto){
     this.email = email;
     this.nome = nome;
     this.numQuarto = numQuarto;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String  name){
        nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    
    @Override
    public String toString(){
        return getNumQuarto() + ": " +  getNome() + ", " + getEmail(); 
    }
    
}
