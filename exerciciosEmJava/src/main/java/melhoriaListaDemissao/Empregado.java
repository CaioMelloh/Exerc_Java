/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melhoriaListaDemissao;

/**
 *
 * @author caioh
 */
public class Empregado {
    private int id;
    private String name;
    private double salary;
    
    public Empregado(){
        
    }
    public Empregado(int id, String name, double salary){
     this.id = id;
     this.name = name;
     this.salary = salary;
    }
   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    
    public void increaseSalary(double x){
        salary+= salary * (x/100);
    }
    @Override
    public String toString(){
        return id + "," + name + "," + String.format("%.2f", salary);
    }
    
 
}
