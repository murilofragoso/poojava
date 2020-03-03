package br.edu.fatecfranca.ads.ex2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    // Métodos Construtores
    
    public Aluno(){
        this.numeroAluno = 0;
        this.nome = "Não definido";
        this.idade = 1;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        setNumeroAluno(numeroAluno);
        setNome(nome);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    }
    
    // Setters
    
    public void setNumeroAluno(int numeroAluno){
        if(String.valueOf(numeroAluno).length() == 6)
            this.numeroAluno = numeroAluno;
        else
            System.out.println("Numero do aluno precisa ter tamanho 6");
    }
    
    public void setNome(String nome){
        if(nome.length() <= 30)
            this.nome = nome;
        else
            System.out.println("Nome pode ter no máximo tamanho 30");
    }
    
    public void setIdade(int idade){
        if(idade > 0)
            this.idade = idade;
        else
            System.out.println("Idade não pode ser negativa");
    }
    
    public void setP1(float p1){
        if(p1 >= 0)
            this.p1 = p1;
        else
            System.out.println("P1 não pode ser negativa");
    }
    
    public void setP2(float p2){
        if(p2 >= 0)
            this.p2 = p2;
        else
            System.out.println("P2 não pode ser negativa");
    }
    
    // Getters
    
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public float getP1(){
        return this.p1;
    }
    
    public float getP2(){
        return this.p2;
    }
    
    // Métodos
    
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String toString(){
        return  "Numero do aluno: " + this.numeroAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade +
                "\n P1: " + this.p1 +
                "\n P2: " + this.p2;
    }
}
