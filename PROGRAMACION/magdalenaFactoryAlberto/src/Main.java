import pojo.*;
import java.util.Scanner; // Importar la clase Scanner

public class Main {
    public static void main(String[] args) {
        // Crear el almacén
        Almacen almacen = new Almacen();

        // Agregar productos al inventario
        almacen.agregarProductoAlInventario(new Producto("Magdalena", 1.50, 10));
        almacen.agregarProductoAlInventario(new Producto("Croissant", 1.30, 20));
        almacen.agregarProductoAlInventario(new Producto("Galleta", 1.70, 15));
        almacen.agregarProductoAlInventario(new Producto("Bollo", 1.00, 20));
        almacen.agregarProductoAlInventario(new Producto("Palmera", 2.70, 10));

        // Mostrar el inventario completo
        System.out.println("=== Inventario completo ===");
        almacen.mostrarInventario();

        // Solicitar al usuario el nombre del producto para buscar
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        System.out.println("=== Búsqueda de productos ===");
        System.out.print("Introduce el nombre del producto que deseas buscar: ");
        String nombreProducto = scanner.nextLine(); // Leer la entrada del usuario

        // Buscar el producto en el inventario
        Producto miProducto = almacen.buscarProductoPorNombre(nombreProducto);
        if (miProducto != null) {
            System.out.println("Producto encontrado: " + miProducto.toString());
        } else {
            System.out.println("El producto no se encuentra en el inventario.");
        }

        scanner.close(); // Cerrar el Scanner
    }
}
