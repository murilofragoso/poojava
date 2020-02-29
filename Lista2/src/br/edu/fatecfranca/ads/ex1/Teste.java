/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.ex1;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author 1090481823025
 */
public class Teste {

    public static void main(String[] args) {
        String nc = JOptionPane.showInputDialog("Insira o numero da conta");
        String na = JOptionPane.showInputDialog("Insira o numero da agência");
        String no = JOptionPane.showInputDialog("Insira o nome do cliente");
        float sal = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo da conta"));
        
        Cliente fulano = new Cliente(nc, na, no, sal);
        fulano.realizarDeposito(100);
        fulano.realizarSaque(30);
        
        JOptionPane.showMessageDialog(null, fulano.toString());
        
        /*
        * fulano.saldo = 50
        * não é permitido pois saldo é privado
        * deve-se usar setSaldo
        */
        
        nc = JOptionPane.showInputDialog("Insira o numero da conta");
        na = JOptionPane.showInputDialog("Insira o numero da agência");
        no = JOptionPane.showInputDialog("Insira o nome do cliente");
        sal = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo da conta"));
        
        Cliente beltrano = new Cliente();
        beltrano.setNumeroConta(nc);
        beltrano.setNumeroAgencia(na);
        beltrano.setNome(no);
        beltrano.setSaldo(sal);
        
        beltrano.realizarDeposito(500);
        beltrano.realizarSaque(250);
        
        JOptionPane.showMessageDialog(null, beltrano.toString());
        
    }
    
}
