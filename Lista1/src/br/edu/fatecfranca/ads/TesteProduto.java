package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;


public class TesteProduto {

    public static void main(String[] args) {
        //Criando Objetos
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID"));
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
        String desc = JOptionPane.showInputDialog("Informe a descrição");
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o Preço"));
        
        Produto obj1 = new Produto(id, qtde, desc, preco);
        obj1.Comprar(10);
        obj1.Vender(5);
        obj1.Subir(5);
        obj1.Descer(3);
        
        JOptionPane.showMessageDialog(null, obj1.Mostrar());
        
        Produto obj2 = new Produto();
        obj2.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID")));
        obj2.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade")));
        obj2.setDescricao(JOptionPane.showInputDialog("Informe a descrição"));
        obj2.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Informe o Preço")));
        
        obj2.Comprar(20);
        obj2.Vender(6);
        obj2.Subir(10);
        obj2.Descer(4);
        
        JOptionPane.showMessageDialog(null, obj2.Mostrar());
    }
    
}
