import java.util.ArrayList;
class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

public class Ejercicio10 {
    public static void agregarProducto(ArrayList<Producto> inventario, String nombre, double precio, int cantidad) {
        inventario.add(new Producto(nombre, precio, cantidad));
    }

    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {
        double total = 0;
        for (Producto p : productos) {
            total += p.precio * p.cantidad;
        }
        return total;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {
        System.out.println("\n INVENTARIO");
        System.out.printf("%-15s | %-8s | %-8s%n", "Producto", "Precio", "Cantidad");
        System.out.println("----------------------------------------");

        for (Producto p : productos) {
            System.out.printf("%-15s | $%-7.2f | %-8d%n",
                    p.nombre, p.precio, p.cantidad);
        }

        System.out.println("----------------------------------------");
        System.out.printf(" VALOR TOTAL: $%.2f%n", calcularValorTotalInventario(productos));
    }

    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();

        agregarProducto(inventario, "Cuaderno", 5000, 20);
        agregarProducto(inventario, "Lápiz", 800, 50);
        agregarProducto(inventario, "Borrador", 500, 30);
        agregarProducto(inventario, "Marcador", 1200, 25);

        mostrarInventario(inventario);
    }
}

