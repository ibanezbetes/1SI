public abstract class SerFondoMarino {
    protected String nombre;
    protected String tipoSer;
    protected String direccion;
    public SerFondoMarino(String nombre, String tipoSer, String direccion) {
        this.nombre = nombre;
        this.tipoSer = tipoSer;
        this.direccion = direccion;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipoSer() { return tipoSer; }
    public void setTipoSer(String tipoSer) { this.tipoSer = tipoSer; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String toString() {
        return nombre + " (" + tipoSer + "), " + direccion;
    }
}