package br.edu.fatecfranca.ads;

public class Gato extends Pet{
    
    private Boolean sobeNoTelhadoANoite;

    public Gato() {
        super();
    }

    public Gato(Boolean sobeNoTelhadoANoite, String nome, String cor) {
        super(nome, cor);
        this.sobeNoTelhadoANoite = sobeNoTelhadoANoite;
    }
        
    public String miar(){
        return "Miau!";
    }
    
    @Override
    public String demonstrarCarinho(){
        return super.demonstrarCarinho()  + " e ronrona";
    }

    @Override
    public String toString() {
        return "Gato{" + "sobeNoTelhadoANoite=" + sobeNoTelhadoANoite + super.toString() + '}';
    }
 
}
