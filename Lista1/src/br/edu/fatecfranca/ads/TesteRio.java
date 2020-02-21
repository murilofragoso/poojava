package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class TesteRio {

    public static void main(String[] args) {
        // Criando objetos
        String nome = JOptionPane.showInputDialog("Informe o nome");
        float nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nivel"));
        boolean poluido = JOptionPane.showConfirmDialog(null, "O rio está poluido?", 
                "O rio está poluido?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        
        Rio obj1 = new Rio(nome, nivel, poluido);
        obj1.Chover(5);
        obj1.Limpar();
        
        JOptionPane.showMessageDialog(null, obj1.Mostrar());
        
        Rio obj2 = new Rio();
        obj2.nome = JOptionPane.showInputDialog("Informe o nome");
        obj2.nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nivel"));
        obj2.poluido = JOptionPane.showConfirmDialog(null, "O rio está poluido?", 
                "O rio está poluido?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        
        obj2.Ensolarar(3);
        obj2.Sujar();
        
        JOptionPane.showMessageDialog(null, obj2.Mostrar());
    }
    
}
