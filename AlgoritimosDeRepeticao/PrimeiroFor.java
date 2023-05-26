package AlgoritimosDeRepeticao;

import javax.swing.JOptionPane;

/**
 * PrimeiroFor
 */
public class PrimeiroFor {

    public static void main(String[] args) {

        String qt = JOptionPane.showInputDialog(null, "Quantas vezes deseja rodar o loop: ", "Primeiro FOR", JOptionPane.QUESTION_MESSAGE);
        int qtd = Integer.parseInt(qt);
        
        for (int i = 0; i < qtd; i++){

            String nome = JOptionPane.showInputDialog(null, "Nome do Aluno: ", "Primeiro FOR", JOptionPane.QUESTION_MESSAGE);
            String nf = JOptionPane.showInputDialog(null, "Média Final: ", "Primeiro FOR", JOptionPane.QUESTION_MESSAGE);
            double media = Double.parseDouble(nf);
            String msg = "Aluno: " + nome + "\nMédia: " + media;// Média: %d", nome, media);
            JOptionPane.showMessageDialog(null, msg, "Primeiro FOR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}