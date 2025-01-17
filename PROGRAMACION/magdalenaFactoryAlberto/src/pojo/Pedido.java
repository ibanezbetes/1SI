package pojo;

public class Pedido {
    private int numProductos;
    private Producto[] lstProductos;
    private int contador = 0;

    public Pedido(int numProductos) {
        if (numProductos > 0) {
            this.numProductos = numProductos;
            this.lstProductos = new Producto[numProductos];
        } else {
            throw new IllegalArgumentException("El número de productos debe ser mayor que 0.");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numProductos=" + numProductos +
                '}';
    }

    public void setNumProductos(int numProductos) {
        if (numProductos > 0) {
            this.numProductos = numProductos;
        }
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void agregarProducto(Producto miProducto, int cant) {
        if (contador < numProductos) {
            if (miProducto.getStock() >= cant) {
                this.lstProductos[contador] = miProducto;
                miProducto.setStock(miProducto.getStock() - cant);
                contador++;
            } else {
                System.out.println("Stock insuficiente para agregar " + cant + " unidades de " + miProducto.getNombre());
            }
        } else {
            System.out.println("No se pueden agregar más productos al pedido.");
        }
    }

    public void imprimirTicket() {
        System.out.println("Su ticket digital:");
        System.out.println("Fecha: 14/01/2025");
        System.out.println("Hora: 12:10");
        for (Producto producto : lstProductos) {
            if (producto != null) {
                System.out.println(producto.toString());
            }
        }
    }
}
