package armas;

public abstract class arma {

    protected String nombre;

    public arma(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "arma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
