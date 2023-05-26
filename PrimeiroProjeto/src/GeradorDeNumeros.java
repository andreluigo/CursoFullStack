import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class GeradorDeNumeros {
    public static void main (String[] args) {
        Random random = new Random();

        String numerosPorCartela = JOptionPane.showInputDialog(null, "Números Por Cartela: " , "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n = Integer.parseInt(numerosPorCartela);

        String qt = JOptionPane.showInputDialog(null, "Quantidade de Cartelas: " , "Gerador de Números", JOptionPane.QUESTION_MESSAGE);
        int n2 = Integer.parseInt(qt);

        String result = ""; // Variável para armazenar os números gerados e ordenados

        for (int vez = 0; vez < n2; vez++) {
            int gerados[] = new int[n];
            for (int i = 0; i < n; i++) {
                gerados[i] = random.nextInt(60)+1;
            }
            Arrays.sort(gerados);

            result += "Cartela " + (vez+1) + ": " + getString(gerados) + "\n"; // Adiciona os números gerados e ordenados à variável result
        } 

        JOptionPane.showMessageDialog(null, result.toString(), "Gerador de Números", JOptionPane.INFORMATION_MESSAGE); // Exibe os números gerados e ordenados na tela
    }

    public static String getString(int[] array) {
        
        String result = "";
        
        for (int j = 0; j < array.length; j++) {
            if (j < array.length -1) {
                result += array[j] + ", ";
        } else {
            result += array[j];
        }        
    } 
    return result.toString();

    /*public static String getString(int[] array) {
        String result = "";

        for (int j = 0; j < array.length; j++){
            if (j < array.length -1){
                result += array[j] + ", ";
            } else {
                result += array[j];
            }
        }

        return result;*/
    
    
    }



}