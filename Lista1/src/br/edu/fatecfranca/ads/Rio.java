/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads;
/**
 * UML Rio
 * - nome: String
 * - nivel: float
 * - poluido: boolean
 * + chover(float): void
 * + ensolarar(float): void
 * + limpar(): void
 * + sujar(): void
 * + mostrar(): String
 */
public class Rio {
    //Variáveis
    String nome;
    float nivel;
    boolean poluido;
    
    //Métodos Construtores
    public Rio(){
    }
    
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void Chover(float x){
        this.nivel = this.nivel + x;
    }
    
    public void Ensolarar(float x){
        this.nivel = this.nivel - x;
    }
    
    public void Limpar(){
        this.poluido = false;
    }
    
    public void Sujar(){
        this.poluido = true;
    }
       
    public String Mostrar(){
        return  "Nome: " + this.nome +
                "\n Nível: " + this.nivel +
                "\n Poluido: " + this.poluido;
    }
}
