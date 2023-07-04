package ManipulandoArquivos.base;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
//import java.util.stream.Stream;

public class writeFileServiceImpl implements writeFileService {

    private String file;

    public writeFileServiceImpl (String file){
        this.file = file;
    }

    @Override
    public void salvar(String value) {

        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter(file + ".txt"));
            writer.write(value);
            writer.close();
            System.out.println("Arquivo salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    @Override
    public void ler() {
        try {
            Scanner in = new Scanner(new FileReader(file + ".txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            // BufferedReader reader = new BufferedReader (new FileReader(file + ".txt"));
            // Stream<String> texto = reader.lines();
            // reader.close();
            //return texto;            
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
    }
    
}
