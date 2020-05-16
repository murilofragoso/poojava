package br.edu.fatecfranca.ads.ex0;

public class Teste {
    public static void calculaSalarioMostra(Funcionario fun){
        fun.calculaSalario();
        System.out.println(fun.toString());
    }
    
     public static void main(String[] args) {
        Gerente ger = new Gerente(200, "Adalberto", 40, 30);
        ger.calculaSalario();

        System.out.println(ger.toString());

        Diretor dir = new Diretor(500, "Ferrari", "Joaquin", 40, 40);
        dir.calculaSalario();

        System.out.println(dir.toString());
        
        calculaSalarioMostra(ger);
        calculaSalarioMostra(dir);
        
        Departamento dep = new Departamento();
        dep.setNome("Contabilidade");
        dep.setSetor("Contábil");
        dep.addFuncionario(ger);
        dep.addFuncionario(dir);
        
         System.out.println(dep.toString());
    }
    
}
