import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(String.format("O número " + numero+" é par!"));
        }
        else{
            System.out.println(String.format("O número " +numero+ " é ímpar!"));
        }
        sc.close();
    }
}
