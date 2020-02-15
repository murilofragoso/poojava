package br.edu.fatecfranca.ads;
import javax.swing.JOptionPane;
/**
 * @author 1090481823025
 */
public class Teste {

    public static void main(String[] args) {
        // Criando objetos
        String mo = JOptionPane.showInputDialog("Informe o modelo");
        String ma = JOptionPane.showInputDialog("Informe a marca");
        int aux = JOptionPane.showConfirmDialog(null, "O motor está ligado?", 
                "O motor está ligado?", JOptionPane.YES_NO_OPTION);
        boolean mt = aux == JOptionPane.YES_OPTION;
        float va = Float.parseFloat(JOptionPane.showInputDialog("Informe a vel atual"));
        
        Carro obj1 = new Carro(mo, ma, mt, va);
        obj1.ligar();
        obj1.acelerar(70);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        
        mo = JOptionPane.showInputDialog("Informe o modelo");
        ma = JOptionPane.showInputDialog("Informe a marca");
        aux = JOptionPane.showConfirmDialog(null, "O motor está ligado?", 
                "O motor está ligado?", JOptionPane.YES_NO_OPTION);
        mt = aux == JOptionPane.YES_OPTION;
        va = Float.parseFloat(JOptionPane.showInputDialog("Informe a vel atual"));
                
        Carro obj2 = new Carro(mo, ma, mt, va);
        obj2.desligar();
        obj2.frear(30);
        
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
    
}
