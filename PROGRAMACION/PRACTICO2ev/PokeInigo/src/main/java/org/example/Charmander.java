package org.example;

class Charmander extends PokemonFuego {
    public Charmander(String nombre, int nivel, int psMax) {
        super(nombre, nivel, psMax);
    }


    public void calentarCola() {
        System.out.println(nombre + " calienta su cola. Daño de fuego incrementado.");
    }
}
