package br.edu.fatecfranca.ads.ex1;

import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiro {

    public static void main(String[] args) {
        // Construtor com parametros
        Passageiro passageiro1 = new Passageiro("João", "444222555-36");
        Voo voo1 = new Voo("3417", "Milão");
        Reserva reserva1 = new Reserva(1, new Date(), passageiro1, voo1);
        
        JOptionPane.showMessageDialog(null, passageiro1.toString());
        JOptionPane.showMessageDialog(null, voo1.toString());
        JOptionPane.showMessageDialog(null, reserva1.toString());
        
        // Construtor sem parametros
        Passageiro passageiro2 = new Passageiro();
        passageiro2.setCpf("222444666-63");
        passageiro2.setNome("Cristiano");
        
        Voo voo2 = new Voo();
        voo2.setDestino("Tokyo");
        voo2.setNumero("4452");
        
        Reserva reserva2 = new Reserva();
        reserva2.setCodigo(2);
        reserva2.setData(new Date());
        reserva2.setPassageiro(passageiro2);
        reserva2.setVoo(voo2);
        
        JOptionPane.showMessageDialog(null, passageiro2.toString());
        JOptionPane.showMessageDialog(null, voo2.toString());
        JOptionPane.showMessageDialog(null, reserva2.toString());
    }
    
}
