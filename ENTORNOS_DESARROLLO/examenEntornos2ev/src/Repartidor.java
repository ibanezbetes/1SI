import java.util.Date;

public class Repartidor extends Trabajador {
    private String licenciaConducir;
    private boolean tieneInfraccion;
    public Repartidor(String nombre, String tipoSer, String direccion, Date fechaContratacion, double sueldo, String licenciaConducir, boolean tieneInfraccion) {
        super(nombre, tipoSer, direccion, fechaContratacion, sueldo);
        this.licenciaConducir = licenciaConducir;
        this.tieneInfraccion = tieneInfraccion;
    }
    public String getLicenciaConducir() { return licenciaConducir; }
    public void setLicenciaConducir(String licenciaConducir) { this.licenciaConducir = licenciaConducir; }
    public boolean isTieneInfraccion() { return tieneInfraccion; }
    public void setTieneInfraccion(boolean tieneInfraccion) { this.tieneInfraccion = tieneInfraccion; }
    public String toString() {
        return "Repartidor: " + super.toString() + ", licenciaConducir=" + licenciaConducir + ", tieneInfraccion=" + tieneInfraccion;
    }
}