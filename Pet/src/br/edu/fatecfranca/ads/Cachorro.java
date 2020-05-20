package br.edu.fatecfranca.ads;

public class Cachorro extends Pet{

    public Cachorro() {
    }

    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }
       
    public String latir(){
        return "Au Au!";
    }
    
    @Override
    public String demonstrarCarinho(){
        return super.demonstrarCarinho()  + " e te de uma lambida";
    }
    
}
