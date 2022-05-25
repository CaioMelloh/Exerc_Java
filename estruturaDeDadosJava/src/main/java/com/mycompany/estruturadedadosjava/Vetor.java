/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadedadosjava;

/**
 *
 * @author caioh
 */
public class Vetor{
    public String[] elementos;               //a classe vetor possui um vetor de elementos onde 
    int tamanho ;   
    

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;                           //construtor que insere uma capacidade ao vetor
    }
    
    /*percorrer todo o vetor em busca de uma posição nula e adc*/
  /* public void adiciona(String elemento){
        for(int i= 0; i< elementos.length; i++){
            if(elementos[i] == null){
             elementos[i] = elemento;
             break;
            }
        }
   }
    } /* há um problema com esse método, toda vez que quiser adc um elemento
    terei que percorrer todo vetor em busca de um nulo
    */
    
// forma mais eficiente
    
    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else{
            throw new Exception("Você excedeu o tamanho limite do seu vetor!");
           
        }
        
        
    }
    
}
    
