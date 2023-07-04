import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class EntreDatas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data Inicial (dia/mês/ano):");
        String dataInicial = scanner.next();

        LocalDate dateInicial = LocalDate.parse(dataInicial,formatter);
        LocalDate dateFinal;

        System.out.println("Usar data de hoje? (s/n):");
        
        if (scanner.next().toLowerCase().equals("s")) {
            dateFinal = LocalDate.now();
        } else {
            System.out.println("Data Final (dia/mês/ano):");
            String dataFinal = scanner.next();
            dateFinal = LocalDate.parse(dataFinal, formatter);
        }
        scanner.close();
        System.out.println("Diferença em Dias: " + ChronoUnit.DAYS.between(dateInicial, dateFinal));
        System.out.println("Diferença em Meses: " + ChronoUnit.MONTHS.between(dateInicial, dateFinal));
        System.out.println("Diferença em Anos: " + ChronoUnit.YEARS.between(dateInicial, dateFinal));
    }
    
}
