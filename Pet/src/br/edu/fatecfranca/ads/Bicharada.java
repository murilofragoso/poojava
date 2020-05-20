package br.edu.fatecfranca.ads;

import java.util.ArrayList;

public class Bicharada {
    private String nomeBicharada;
    private String nomeUsuario;
    private ArrayList<Pet> pets;

    public Bicharada() {
        this.pets = new ArrayList();
    }

    public Bicharada(String nomeBicharada, String nomeUsuario, ArrayList<Pet> pets) {
        this.nomeBicharada = nomeBicharada;
        this.nomeUsuario = nomeUsuario;
        this.pets = pets;
    }

    public String getNomeBicharada() {
        return nomeBicharada;
    }

    public void setNomeBicharada(String nomeBicharada) {
        this.nomeBicharada = nomeBicharada;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Bicharada{" + "nomeBicharada=" + nomeBicharada + ", nomeUsuario=" + nomeUsuario + ", pets=" + pets + '}';
    }
    
    public Boolean adicionarPet(Pet novoPet){
        return this.pets.add(novoPet);
    }
    
}
