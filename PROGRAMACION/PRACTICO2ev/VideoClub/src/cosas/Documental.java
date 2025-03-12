package cosas;

import INTERFACES.IAlquilable;
import cliente.Cliente;

public class Documental extends RecursoAudiovisual implements IAlquilable {

    private 
    public Documental(String titulo, String director, String codigo) {
        super(titulo, director, codigo);
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
}
