package br.edu.fatecfranca.ads.ex1;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;
    
    public Reserva(){
        
    }

    public Reserva(int codigo, Date data, Passageiro passageiro, Voo voo) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return this.passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return this.voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", data=" + data + 
                ", passageiro=" + passageiro.toString() + ", voo=" + voo.toString() + '}';
    }
    
}
