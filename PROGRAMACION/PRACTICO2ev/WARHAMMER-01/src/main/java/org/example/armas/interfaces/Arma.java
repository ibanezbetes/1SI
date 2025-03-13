package org.example.armas.interfaces;

import org.example.personajes.WarhammerPersonaje;

public abstract class Arma {
    protected String nombre;

    public Arma(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
