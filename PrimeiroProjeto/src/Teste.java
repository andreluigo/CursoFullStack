import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        
        Random random = new Random();
        String result = "";

        Integer[] numeros = new Integer[4];
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < numeros.length; j++){
                numeros[j] = random.nextInt(11);
            }
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            arrayList.add(numeros);
            result = result + "ArrayList " + (i+1) + ": " + Arrays.toString(arrayList.get(i)) + "\n";
        }
        System.out.println(result);
    }
}