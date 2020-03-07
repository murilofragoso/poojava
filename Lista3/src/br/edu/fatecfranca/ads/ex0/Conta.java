package br.edu.fatecfranca.ads.ex0;

public class Conta {
    private String numeroConta, agencia, nomeCorrentista;
    private float saldo;

    // Construtor
    public Conta() {
    }
    
    // Getters
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
    // Setters
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", agencia=" + agencia + 
                ", nomeCorrentista=" + nomeCorrentista + ", saldo=" + saldo + '}';
    }
    
}
