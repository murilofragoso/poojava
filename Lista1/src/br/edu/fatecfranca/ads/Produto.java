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
    private int id, qtde;
    private String descricao;
    private float preco;
    
    //Métodos Construtores
    public Produto(){
        this.id = 0;
        this.qtde = 0;
        this.descricao = "Não definido";
        this.preco = 0;
    }
    
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.setPreco(preco);
    }
    
    //setters
    public void setPreco(float preco){
        if(preco >= 0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço não pode ser negativo");
        }
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    //getters
    public float getPreco(){
        return this.preco;
    }
    
    public int getQtde(){
        return this.qtde;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDescricao(){
        return this.descricao;
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
        this.setPreco(this.preco - x);
    }
    
    public String Mostrar(){
        return  "ID: " + this.id +
                "\n Quantidade: " + this.qtde +
                "\n Descrição: " + this.descricao +
                "\n Preço: " + this.preco;
    }
            
}
