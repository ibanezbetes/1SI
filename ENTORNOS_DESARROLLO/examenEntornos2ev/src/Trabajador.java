import java.util.Date;

public abstract class Trabajador extends SerFondoMarino {
    protected Date fechaContratacion;
    protected double sueldo;
    public Trabajador(String nombre, String tipoSer, String direccion, Date fechaContratacion, double sueldo) {
        super(nombre, tipoSer, direccion);
        this.fechaContratacion = fechaContratacion;
        this.sueldo = sueldo;
    }
    public Date getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(Date fechaContratacion) { this.fechaContratacion = fechaContratacion; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
}