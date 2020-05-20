package br.edu.fatecfranca.ads;

public class Teste {

    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Bidu", "Azul");
        
        System.out.println(dog1.toString());
        System.out.println(dog1.demonstrarCarinho());
        
        Gato cat1 = new Gato("Mingau", "Branco");
        
        System.out.println(cat1.toString());
        System.out.println(cat1.demonstrarCarinho());
        
        Bicharada bichos1 =  new Bicharada();
        bichos1.setNomeBicharada("Pets Turma da Mônica");
        bichos1.setNomeUsuario("Murilo");
        
        bichos1.adicionarPet(dog1);
        bichos1.adicionarPet(cat1);
        
        System.out.println(bichos1.toString());
    }
    
}
