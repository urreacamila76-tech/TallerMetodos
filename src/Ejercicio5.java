import javax.swing.*;

public class Ejercicio5 {
    public static double calcularPromedio(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2:"));
        double promDos = calcularPromedio(n1, n2);
        JOptionPane.showMessageDialog(null, "Promedio de las 2 notas: " + promDos);

        double[] notas = { n1, n2, 4.0};
        double promArr = calcularPromedio(notas);
        JOptionPane.showMessageDialog(null, "promedio arreglado: " + promArr);
    }
}
