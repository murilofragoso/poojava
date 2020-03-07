package br.edu.fatecfranca.ads.ex0;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Conta objParte = new Conta();
        objParte.setAgencia("5678");
        objParte.setNomeCorrentista("Pedro");
        objParte.setNumeroConta("123-4");
        objParte.setSaldo(3000);
        
        Cartao objTodo = new Cartao();
        objTodo.setBandeira("Master");
        objTodo.setCvv(666);
        objTodo.setNumeroCartao("1111111111111111");
        objTodo.setValidade("10/22");
        objTodo.setSenha("1597");
        // associação de agregação
        objTodo.setConta(objParte);
        
        JOptionPane.showMessageDialog(null, objTodo);
        
        JOptionPane.showMessageDialog(null, objTodo.sacar(4000, "1597"));
        JOptionPane.showMessageDialog(null, objTodo.sacar(200, "1598"));
        JOptionPane.showMessageDialog(null, objTodo.sacar(200, "1597"));
        
        JOptionPane.showMessageDialog(null, objTodo);
        
    }
    
}
