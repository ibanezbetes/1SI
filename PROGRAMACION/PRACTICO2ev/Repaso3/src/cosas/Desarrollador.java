package cosas;

import java.util.ArrayList;

public class Desarrollador {
    private String nombre;
    private ArrayList juegosDesarrollados;

    public Desarrollador(String nombre) {
        this.nombre = nombre;
        this.juegosDesarrollados=new ArrayList<>();
    }

    public void registrarVideojuego(Videojuego juego){

    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
