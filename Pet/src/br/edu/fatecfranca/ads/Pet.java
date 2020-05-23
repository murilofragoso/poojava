package br.edu.fatecfranca.ads;

public abstract class Pet {
    protected String nome;
    protected String cor;

    public Pet() {
    }

    public Pet(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\n Pet{" + "nome=" + nome + ", cor=" + cor + '}';
    }
    
    public String demonstrarCarinho(){
        return this.nome + " se aproxima de você";
    }
}
