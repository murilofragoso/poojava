/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads;
/**
 * UML Produto
 * - id: int
 * - qtde: int
 * - descricao: String
 * - preco: float
 * + comprar(int): void
 * + vender(int): void
 * + subir(float): void
 * + descer(float): void
 * + mostrar(): String
 */

public class Produto {
    //Variáveis
    int id, qtde;
    String descricao;
    float preco;
    
    //Métodos Construtores
    public Produto(){
    }
    
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    //Métodos
    public void Comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void Vender(int x){
        this.qtde = this.qtde - x;
    }
    
    public void Subir(float x){
        this.preco = this.preco + x;
    }
    
    public void Descer(float x){
        this.preco = this.preco - x;
    }
    
    public String Mostrar(){
        return  "ID: " + this.id +
                "\n Quantidade: " + this.qtde +
                "\n Descrição: " + this.descricao +
                "\n Preço: " + this.preco;
    }
            
}
