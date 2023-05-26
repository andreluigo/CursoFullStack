package Exercicios;

import javax.swing.JOptionPane;

/**
 * ExercicioTriangulo
 */
public class ExercicioTriangulo {

    public static void main(String[] args) {
        
        String ladoa = JOptionPane.showInputDialog(null, "Digite o tamanho do lado a: ", "Tipos de Triângulos", JOptionPane.QUESTION_MESSAGE);
        double a = Double.parseDouble(ladoa);
        String ladob = JOptionPane.showInputDialog(null, "Digite o tamanho do lado b: ", "Tipos de Triângulos", JOptionPane.QUESTION_MESSAGE);
        double b = Double.parseDouble(ladob);
        String ladoc = JOptionPane.showInputDialog(null, "Digite o tamanho do lado c: ", "Tipos de Triângulos", JOptionPane.QUESTION_MESSAGE);
        double c = Double.parseDouble(ladoc);

        if (a == b && b == c){
            JOptionPane.showMessageDialog(null, "O Triângulo é Equilátero!", "Tipos de Triângulo", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (a == b || a == c || b == c){
            JOptionPane.showMessageDialog(null, "O Triângulo é Isósceles!", "Tipos de Triângulo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O Triângulo é Escaleno!", "Tipos de Triângulo", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}