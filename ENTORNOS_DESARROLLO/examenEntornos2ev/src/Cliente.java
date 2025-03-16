public class Cliente extends SerFondoMarino {
    private double dineroGastado;
    public Cliente(String nombre, String tipoSer, String direccion, double dineroGastado) {
        super(nombre, tipoSer, direccion);
        this.dineroGastado = dineroGastado;
    }
    public double getDineroGastado() { return dineroGastado; }
    public void setDineroGastado(double dineroGastado) { this.dineroGastado = dineroGastado; }
    public String toString() {
        return "Cliente: " + super.toString() + ", dineroGastado=" + dineroGastado;
    }
}