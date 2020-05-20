package br.edu.fatecfranca.ads;

public class Teste {

    public static void mostrarPet(Pet camaleao){
        System.out.println(camaleao.toString());
        System.out.println(camaleao.demonstrarCarinho());
    }
        
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Bidu", "Azul");
        
        mostrarPet(dog1);
        
        Gato cat1 = new Gato("Mingau", "Branco");
        
        mostrarPet(cat1);
        
        Bicharada bichos1 =  new Bicharada();
        bichos1.setNomeBicharada("Pets Turma da Mônica");
        bichos1.setNomeUsuario("Murilo");
        
        bichos1.adicionarPet(dog1);
        bichos1.adicionarPet(cat1);
        
        System.out.println(bichos1.toString());
    }

}
