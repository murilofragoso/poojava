package br.edu.fatecfranca.ads.ex0;

public class Cartao {
    private int cvv;
    private String validade, bandeira, numeroCartao, senha;
    private Conta conta; //associação
    
    // Construtor
    public Cartao(){
    }
    
    // Getters
    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public int getCvv() {
        return this.cvv;
    }

    public String getValidade() {
        return this.validade;
    }

    public String getBandeira() {
        return this.bandeira;
    }

    public Conta getConta() {
        return this.conta;
    }
    
    public String getSenha(){
        return this.senha;
    }

    // Setters
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cartao{" + "numeroCartao=" + numeroCartao + ", cvv=" + cvv + 
                ", validade=" + validade + ", bandeira=" + bandeira + 
                ", conta=" + conta.toString() + '}';
    }
    
    // Métodos
    public boolean sacar(float valor, String senha){
        if(!this.senha.equals(senha) || this.conta.getSaldo() < valor)
            return false;
        else{
            this.conta.setSaldo(this.conta.getSaldo() - valor);
            return true;
        }
    }
}
