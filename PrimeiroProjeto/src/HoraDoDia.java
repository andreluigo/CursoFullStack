import java.util.Scanner;

public class HoraDoDia {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora do dia: ");
        int horaDoDia = sc.nextInt();

        if (horaDoDia < 12){
            System.out.println("Bom dia!");
        } else if (horaDoDia < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();

    }
}