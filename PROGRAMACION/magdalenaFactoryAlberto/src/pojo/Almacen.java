package pojo;

public class Almacen {
    private Producto[] inventario;
    private int contador;

    public Almacen() {
        this.inventario = new Producto[10]; // Máximo 10 productos
        this.contador = 0;
    }

    // Metodo para agregar un producto al inventario
    public void agregarProductoAlInventario(Producto producto) {
        if (contador < inventario.length) {
            inventario[contador] = producto;
            contador++;
            System.out.println("Producto agregado al inventario: " + producto.getNombre());
        } else {
            System.out.println("Inventario lleno. No se puede agregar más productos.");
        }
    }

    // Método para mostrar el inventario
    public void mostrarInventario() {
        System.out.println("Inventario del almacén:");
        for (int i = 0; i < contador; i++) {
            System.out.println(inventario[i].toString());
        }
        if (contador == 0) {
            System.out.println("El inventario está vacío.");
        }
    }

    // Método para buscar un producto por nombre
    public Producto buscarProductoPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (inventario[i].getNombre().equals(nombre) && inventario[i] != null) {
                System.out.println("pro " +inventario[i].toString());
            }
        }
        System.out.println("Producto no encontrado: " + nombre);
        return null;
    }
}
