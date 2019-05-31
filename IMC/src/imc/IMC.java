package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Sassaki
 * Ciclo3 Programação Orientada a Objetos
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x, y, imc;
        
        String peso, altura, sexo, dec;
        
        dec = "";
        y = 0;
        
        do {
            altura = JOptionPane.showInputDialog("Digite aqui sua altura: ");
            x = Float.parseFloat(altura);

            sexo = JOptionPane.showInputDialog("Digite aqui seu sexo, M para MASCULINO, F para FEMININO: ");
            dec = sexo;

            if (dec.equals("m") || dec.equals("M")) {
                peso = JOptionPane.showInputDialog("Digite aqui seu peso: ");
                y = Float.parseFloat(peso);
            } else if (dec.equals("f") || dec.equals("F")) {
                peso = JOptionPane.showInputDialog("Digite aqui o peso de sua amiga: ");
                y = Float.parseFloat(peso);
            } else {
                JOptionPane.showInputDialog("Opção inválida! ");
            }

            imc = y / (x*x);
            String formatado = String.format("%.2f", imc);

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado);
        } while (dec.equals("m") == false || dec.equals("M") == false || dec.equals("f") == false || dec.equals("F") == false );
    }
}
