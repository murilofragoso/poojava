package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        int na = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do aluno"));
        String no = JOptionPane.showInputDialog("Insira o nome");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
        float p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da p1"));
        float p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da p2"));
        
        Aluno fulano = new Aluno(na, no, i, p1, p2);
        
        JOptionPane.showMessageDialog(null, fulano.toString());
        JOptionPane.showMessageDialog(null, fulano.notaFinal());
        
        /*
        * fulano.idade = 25
        * não é permitido pois idade é privado
        * deve-se usar setIdade
        */
        
        na = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do aluno"));
        no = JOptionPane.showInputDialog("Insira o nome");
        i = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
        p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da p1"));
        p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da p2"));
        
        Aluno beltrano = new Aluno();
        
        beltrano.setNumeroAluno(na);
        beltrano.setNome(no);
        beltrano.setIdade(i);
        beltrano.setP1(p1);
        beltrano.setP2(p2);
        
        JOptionPane.showMessageDialog(null, beltrano.toString());
        JOptionPane.showMessageDialog(null, beltrano.notaFinal());
    }
    
}
