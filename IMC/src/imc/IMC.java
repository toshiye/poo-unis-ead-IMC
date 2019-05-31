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
                JOptionPane.showMessageDialog(null, "Opção inválida! ");
            }

            imc = y / (x*x);
            String formatado = String.format("%.2f", imc);
            
            String classificacao = "";
            
            if (imc < 17.0){
                classificacao = "Muito abaixo do peso: Cade você?";
            } else if (imc >= 17.0 && imc < 18.49) {
                classificacao = "Abaixo do peso: Você está abaixo do peso, melhor se cuidar.";
            } else if (imc >= 18.5 && imc < 24.99) {
                classificacao = "Peso normal: Parabéns, você está com bom peso.";
            } else if (imc >= 25.0 && imc < 29.99) {
                classificacao = "Acima do peso: Cuidado, você está acima do peso.";
            } else if (imc >= 30 && imc < 34.99) {
                classificacao = "Obesidade I: Amigo, você está Obeso, melhor começar um regime!";
            } else if (imc >= 35 && imc < 39.99) {
                classificacao = "Obesidade severa: Parceiro, é sério, sua Obesidade é SEVERA, ainda não começou o regime?";
            } else if (imc > 40) {
                classificacao = "Obesidade mórbida: Brother, agora deu, Você não come mais nada até ficar sequinho!!!";
            }

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " e sua classificação é " + classificacao);;
        } while (dec.equals("m") == false || dec.equals("M") == false || dec.equals("f") == false || dec.equals("F") == false );
    }
}
