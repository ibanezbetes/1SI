package org.example;

class Charizard extends PokemonEvolucionado {
    public Charizard(String nombre, int nivel, int psMax, int bonificacionEvo) {
        super(nombre, nivel, psMax, bonificacionEvo);
    }


    public void lanzarFuego() {
        System.out.println(nombre + " lanza una llamarada de fuego enorme.");
    }
}
