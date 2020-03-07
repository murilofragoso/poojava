package br.edu.fatecfranca.ads.ex1;

public class Passageiro {
    private String nome, cpf;

    public Passageiro(){
        
    }
    
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
}
