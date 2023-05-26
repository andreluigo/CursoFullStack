package AlgoritimosDeRepeticao;

import javax.swing.JOptionPane;

public class PrimeiroArray {
    
    public static void main(String[] args) {
        
        String[] nomes = {"Ana", "Jean", "Italo", "Maria"};

        for (int i = 0; i < nomes.length; i++){
            int j = i+1;
            String msg = "Posição: " + j + "\nNome: " + nomes[i] + "\n";
            JOptionPane.showMessageDialog(null, msg, "Primeiro Array", JOptionPane.QUESTION_MESSAGE);
        }

    }
}
