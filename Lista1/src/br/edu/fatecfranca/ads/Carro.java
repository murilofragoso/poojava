package br.edu.fatecfranca.ads;
/**
 * @author 1090481823025
 */
public class Carro {
    // Variáveis
    private String modelo, marca;
    private boolean motor;
    private float velAtual;
    
    // Método construtor
    public Carro(String modelo, String marca, boolean motor, float velAtual){
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    
    // Métodos
    public void ligar(){
        this.motor = true;
    }
    
    public void desligar(){
        this.motor = false;
    }
    
    public void acelerar(float x){
        this.velAtual = this.velAtual + x;
    }
    
    public void frear(float x){
        this.velAtual = this.velAtual - x;
    }
    
    public String toString(){
        // Operador + converte boolean e float em string
        return  "Modelo: " + this.modelo + 
                "\n Marca: " + this.marca +
                "\n Motor: " + this.motor +
                "\n Vel Atual: " + this.velAtual;
                
    }
}
