import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Numeros Por Cartela: ");
        int numerosPorCartela = sc.nextInt();

        System.out.print("Quantidade de Cartelas: ");
        int qt = sc.nextInt();

        for(int vez = 0; vez < qt; vez++) {
            int[] gerados = new int[numerosPorCartela];
            for (int numero = 0; numero < gerados.length; numero++) {
                gerados[numero] = random.nextInt(60)+1;
            }

            Arrays.sort(gerados);
            
            System.out.printf("Cartela %d: %s\n", (vez+1), getString(gerados));
        }

        sc.close();
    }

    public static String getString(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);

            if (i < array.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}