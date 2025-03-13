package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Entrenador {
    private String nombre;
    private List equipo;



    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon p) {
        equipo.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }

    // Escoge un Pokémon al azar de su equipo
    public Pokemon obtenerPokemonAleatorio() {
        if (equipo.isEmpty()) {
            return null;
        }
        Random r = new Random();
        return (Pokemon) equipo.get(r.nextInt(equipo.size()));
    }
}