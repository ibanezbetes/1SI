package org.example;

public class Charmander extends Pokemon implements TipoFuego{


    public Charmander(String nombre, int nivel, double peso) {
        super(nombre, nivel, peso, "Fuego");
    }

    @Override
    public void ataqueAscuas() {
        System.out.println(getNombre() + " usa Ascuas!");
    }

    @Override
    public void ataqueFuegazo() {
        System.out.println(getNombre() + " usa Fuegazo!");
    }
}
