package br.edu.fatecfranca.ads;

public class Cachorro extends Pet{
    
    private Boolean lateMuito;

    public Cachorro() {
        super();
    }

    public Cachorro(Boolean lateMuito, String nome, String cor) {
        super(nome, cor);
        this.lateMuito = lateMuito;
    }
       
    public String latir(){
        return "Au Au!";
    }
    
    @Override
    public String demonstrarCarinho(){
        return super.demonstrarCarinho()  + " e te de uma lambida";
    }

    @Override
    public String toString() {
        return "Cachorro{" + "lateMuito=" + lateMuito + super.toString() + '}';
    }
    
}
