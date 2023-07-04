import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.HashSet;

public class GeradorDeNumeros {
    public static void main (String[] args) {
        Random random = new Random();

        String numerosPorCartela = JOptionPane.showInputDialog(null, "Números Por Cartela: " , "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n1 = Integer.parseInt(numerosPorCartela);

        String qt = JOptionPane.showInputDialog(null, "Quantidade de Cartelas: " , "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n2 = Integer.parseInt(qt);

        String result = "";

        for (int vez = 0; vez < n2; vez++) {
            
           Set<Integer> numeros = new HashSet<>();

            int gerados[] = new int[n1];
            
            for (int i = 0; i < n1; i++){
                int n;
                do {
                    n = random.nextInt(60)+1;                    
                } while (numeros.contains(n));
                
                gerados[i] = n;
                numeros.add(n);
                
            }          
            
            Arrays.sort(gerados);
            
            result += "Cartela " + (vez+1) + ": " + Arrays.toString(gerados) + "\n";
            
        }     

        JOptionPane.showMessageDialog(null, result.toString(), "Gerador de Números", JOptionPane.INFORMATION_MESSAGE);
    }

}