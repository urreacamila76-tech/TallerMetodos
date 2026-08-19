public class Ejercicio8 {
    public static int[] generarTablaMultiplicar(int numero) {
        int [] tabla = new int[10];
        for (int i = 0; i <10; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public static void main(String[] args) {
        int numero = 8;
        int[] resultado = generarTablaMultiplicar(numero);

        System.out.println("tabla del: " + numero + ":");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println((i + 1) + " x " + numero + " = "
             + resultado[i]);
        }

    }
}
