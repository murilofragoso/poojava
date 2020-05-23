package br.edu.fatecfranca.prova;

import java.util.ArrayList;

public class Montadora {
    private String nome;
    private String cnpj;
    //associação
    private ArrayList<Veiculo> veiculos;

    public Montadora() {
        this.veiculos = new ArrayList();
    }

    public Montadora(String nome, String cnpj, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.veiculos = veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        //quando chama veiculos, chama o  toString() de cada veiculo.
        //Caso veiculo seja um carro, executa toString do carro
        //Caso veiculo seja uma moto, executa toString da moto
        return "Montadora{" + "nome=" + nome + ", cnpj=" + cnpj + ", veiculos=" + veiculos + '}';
    }  
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public boolean removeVeiculo(Veiculo veiculo){
        return this.veiculos.remove(veiculo);
    }
    
    public int getVeiculo(Veiculo veiculo){
        return this.veiculos.indexOf(veiculo);
    }
    
    public boolean updateVeiculo(Veiculo atual, Veiculo novo){
        int pos = this.getVeiculo(atual);
        if(pos != -1){
            this.veiculos.set(pos, novo);
            return true;
        }
        else return false;
    }
}
