import java.util.Date;

public class Pedido {
    private Date fecha;
    private Cliente cliente;
    private Empleado empleado;
    private Repartidor repartidor;
    public Pedido(Date fecha, Cliente cliente, Empleado empleado, Repartidor repartidor) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.repartidor = repartidor;
    }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
    public Repartidor getRepartidor() { return repartidor; }
    public void setRepartidor(Repartidor repartidor) { this.repartidor = repartidor; }
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cliente=" + cliente + ", empleado=" + empleado + ", repartidor=" + repartidor + "]";
    }
}