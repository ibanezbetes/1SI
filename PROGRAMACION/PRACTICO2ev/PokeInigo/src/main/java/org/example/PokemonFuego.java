package org.example;

class PokemonFuego extends Pokemon {
    public PokemonFuego(String nombre, int nivel, int psMax) {
        super(nombre, nivel, psMax);
    }


    // Ejemplo de acción típica de un Pokémon de Fuego
    public void aumentarTemperatura() {
        System.out.println(nombre + " aumenta la temperatura. Próximo ataque de fuego potenciado.");
    }
}
