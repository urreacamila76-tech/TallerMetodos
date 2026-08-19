class Estudiante {
    double nota ;
    public void mostrarNota() {
        System.out.println("Su no es: " + this.nota);
    }

    public static double compararNotas(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        }else{
            return n2;
        }
    }
}
public class Ejercicio6 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nota = 4.2;
        estudiante1.mostrarNota();

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nota = 3.5;
        estudiante2.mostrarNota();

        double mayor = Estudiante.compararNotas(4.2, 3.5);
        System.out.println("la nota mayor es: "  + mayor);
    }
}
