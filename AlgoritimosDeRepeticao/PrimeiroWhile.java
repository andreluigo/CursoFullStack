package AlgoritimosDeRepeticao;

import javax.swing.JOptionPane;

public class PrimeiroWhile {
    
    public static void main(String[] args) {
        
        int contador = 0;

        while (contador < 10){
            int i = contador +1;
            String vez = "Vez: " + i;
            JOptionPane.showMessageDialog(null, vez, "Primeiro While", JOptionPane.QUESTION_MESSAGE);
            contador ++;

        }

        do {
            int j = contador +1;
            String vez = "Vez " + j +"!\n Mudamos de While para Do-while...";
            JOptionPane.showMessageDialog(null, vez, "Primeiro While", JOptionPane.QUESTION_MESSAGE);            
        } while (contador == 11);
    }
}
