import javax.swing.*;

public class Ejercicio9 {
    public static String clasificarNota(double nota) {
        if (nota >= 4.5) return "Excelente >:)";
        else if (nota >= 3.0) return "Aprobado :)";
        else return  "Reprobado :(";
    }

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Escriba su nota: "));
        JOptionPane.showMessageDialog(null, clasificarNota(nota));
    }
}
