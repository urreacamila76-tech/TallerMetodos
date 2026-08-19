import javax.swing.*;

public class Ejercicio4 {
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("escribe un numero:");
        int numero = Integer.parseInt(mensaje);

        boolean resultado = esPar(numero);
        JOptionPane.showMessageDialog(null, "el numero " + numero + " es par? " + resultado);
    }
}