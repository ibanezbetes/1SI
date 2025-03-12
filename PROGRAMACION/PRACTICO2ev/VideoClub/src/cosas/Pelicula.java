package cosas;

import INTERFACES.IAlquilable;
import cliente.Cliente;

public class Pelicula extends RecursoAudiovisual implements IAlquilable {

    private boolean alquilado;
    private String nombreCliente;

    public Pelicula(String titulo, String director, String codigo) {
        super(titulo, director, codigo);
        alquilado=false;
        nombreCliente="";
    }

    @Override
    public void alquilar(Cliente c) {

    }

    @Override
    public void devolver() {

    }

    @Override
    public boolean estaAlquilado() {
        return false;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", codigo='" + codigo + '\'' +
                ", alquilado=" + alquilado +
                ", nombreCliente='" + nombreCliente + '\'' +
                '}';
    }
}
