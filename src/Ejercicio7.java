public class Ejercicio7 {
    public static double calcularPromedioClase(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public static void main(String[] args) {
        double[] notasGrupo = {4.2, 3.9, 4.8, 5.0, 3.5, 4.0};
        double promedio = calcularPromedioClase(notasGrupo);

        System.out.println("notas del grupo: ");
        for (double nota : notasGrupo) {
            System.out.println(nota + " ");
        }

        System.out.println("/n promedio de la clase: " + promedio);
    }
}
