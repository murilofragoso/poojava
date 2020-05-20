package br.edu.fatecfranca.ads;

public class Gato extends Pet{

    public Gato() {
    }

    public Gato(String nome, String cor) {
        super(nome, cor);
    }
        
    public String miar(){
        return "Miau!";
    }
    
    @Override
    public String demonstrarCarinho(){
        return super.demonstrarCarinho()  + " e ronrona";
    }
    
}
