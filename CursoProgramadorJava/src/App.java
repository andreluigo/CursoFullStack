import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite uma palavra: ");
        Scanner sc = new Scanner(System.in);
        String teste = sc.next();
        //int teste2 = Integer.parseInt(teste);
        System.out.println(teste);

        sc.close();

    }
}
