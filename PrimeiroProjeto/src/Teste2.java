import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Teste2 {
    public static void main(String[] args) {
        Random random = new Random();

        String numerosPorCartela = JOptionPane.showInputDialog(null, "Números Por Cartela: ", "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n = Integer.parseInt(numerosPorCartela);

        String qt = JOptionPane.showInputDialog(null, "Quantidade de Cartelas: ", "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n2 = Integer.parseInt(qt);

        for (int vez = 0; vez < n2; vez++) {
            int gerados[] = new int[n];
            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < gerados.length; i++) {
                int novoNumero;
                do {
                    novoNumero = random.nextInt(60) + 1;
                } while (set.contains(novoNumero));
                set.add(novoNumero);
                gerados[i] = novoNumero;
            }
            Arrays.sort(gerados);
            
        }
        
    }

    public static String getString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();

        JOptionPane.showMessageDialog(null, sb, "Cartela " + (vez+1), JOptionPane.INFORMATION_MESSAGE);

    }
}