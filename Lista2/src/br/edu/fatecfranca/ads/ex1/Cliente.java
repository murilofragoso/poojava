/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.ex1;

/**
 *
 * @author 1090481823025
 */
public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    //Métodos Construtores
    public Cliente(){
        this.numeroConta = "000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = "Não definido";
        this.saldo = 0;
    }
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setNome(nome);
        setSaldo(saldo);
    }
    
    //setters
    public void setNumeroConta(String numeroConta){
        if(numeroConta.length() == 8 && numeroConta.charAt(6) == '-')
            this.numeroConta = numeroConta;
        else
            System.out.println("Numero da conta deve ter tamanho 8 e precisa de um dígito verificador");
    }
    
    public void setNumeroAgencia(String numeroAgencia){
        if(numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-')
            this.numeroAgencia = numeroAgencia;
        else
            System.out.println("Numero da agência deve ter tamanho 6 e precisa de um dígito verificador");
    }
    
    public void setNome(String nome){
        if(nome.length() <= 30)
            this.nome = nome;
        else
            System.out.println("Nome deve conter no máximo 30 caracteres");
    }
    
    public void setSaldo(float saldo){
        if(saldo >= 0)
            this.saldo = saldo;
        else
            System.out.println("Saldo não pode ser negativo");
    }
    
    //getters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    //Métodos
    public void realizarDeposito(float valor){
        this.saldo = this.saldo + valor;
    }
    
    public void realizarSaque(float valor){
        this.setSaldo(this.saldo - valor);
    }
    
    public String toString(){
        return  "Numero da conta: " + this.numeroConta +
                "\n Numero da Agência: " + this.numeroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo Atual: " + this.saldo;
    }
}
