import javax.swing.JOptionPane;

public class CalularIMC {
    
    public static void main(String[] args) {

        String nome, altura, peso;
        float imc;

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Cálculo IMC", JOptionPane.QUESTION_MESSAGE);
        altura = JOptionPane.showInputDialog(null, "Informe sua altura, em metros e com ponto: ", "Cálculo IMC", JOptionPane.QUESTION_MESSAGE);
        peso = JOptionPane.showInputDialog(null, "Informe seu peso em kg, usando ponto: ", "Cálculo IMC", JOptionPane.QUESTION_MESSAGE);
        float height = Float.parseFloat(altura);
        float weight = Float.parseFloat(peso);
        imc = weight / (height * height);

        String magreza = String.format("Olá, %s ! %nSeu IMC é %.2f !%n MAGREZA!", nome, imc);
        String normal = String.format("Olá, %s ! %nSeu IMC é %.2f !%n NORMAL!", nome, imc);
        String sobrepeso = String.format("Olá, %s ! %nSeu IMC é %.2f !%n SOBREPESO!", nome, imc);
        String obesidade = String.format("Olá, %s ! %nSeu IMC é %.2f !%n OBESIDADE!", nome, imc);
        String obgrave = String.format("Olá, %s ! %nSeu IMC é %.2f !%n OBESIDADE GRAVE!", nome, imc);


        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, magreza , "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);
        } else if (imc <= 24.9){
            JOptionPane.showMessageDialog(null, normal , "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);
        } else if (imc <= 29.9){
            JOptionPane.showMessageDialog(null, sobrepeso , "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);
        } else if (imc <= 39.9){
            JOptionPane.showMessageDialog(null, obesidade , "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, obgrave , "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);
        }     


    }

}
