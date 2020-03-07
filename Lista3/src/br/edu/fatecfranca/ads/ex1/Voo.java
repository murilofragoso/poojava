package br.edu.fatecfranca.ads.ex1;


public class Voo {
    private String numero, destino;

    public Voo(){
        
    }

    public Voo(String numero, String destino) {
        this.setNumero(numero);
        this.setDestino(destino);
    }
    
    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", destino=" + destino + '}';
    }
    
}
