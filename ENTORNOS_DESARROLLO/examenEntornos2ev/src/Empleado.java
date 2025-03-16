import java.util.Date;

public class Empleado extends Trabajador {
    private int descuadresCaja;
    public Empleado(String nombre, String tipoSer, String direccion, Date fechaContratacion, double sueldo, int descuadresCaja) {
        super(nombre, tipoSer, direccion, fechaContratacion, sueldo);
        this.descuadresCaja = descuadresCaja;
    }
    public int getDescuadresCaja() { return descuadresCaja; }
    public void setDescuadresCaja(int descuadresCaja) { this.descuadresCaja = descuadresCaja; }
    public String toString() {
        return "Empleado: " + super.toString() + ", descuadresCaja=" + descuadresCaja;
    }
}