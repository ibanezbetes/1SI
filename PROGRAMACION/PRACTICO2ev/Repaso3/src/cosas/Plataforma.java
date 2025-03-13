package cosas;

public class Plataforma {
    private String nombre;
    private TipoPlataforma tipo;

    public Plataforma(String nombre, TipoPlataforma tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
