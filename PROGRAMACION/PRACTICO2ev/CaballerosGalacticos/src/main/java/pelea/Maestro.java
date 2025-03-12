package pelea;

import personajes.Guerrero;

import java.util.ArrayList;

public class Maestro {
    private String nombre;
    private ArrayList escuadron;

    public Maestro(String nombre) {
        this.nombre = nombre;
        this.escuadron = new ArrayList<>();
    }

    public void reclutarGuerrero(Guerrero nuevoGuerrero){

    }

    public Guerrero getGuerreroAleatorio(){
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre='" + nombre + '\'' +
                ", Escuadron=" + escuadron +
                '}';
    }
}
