package org.example;

class PokemonElectrico extends Pokemon {
    public PokemonElectrico(String nombre, int nivel, int psMax) {
        super(nombre, nivel, psMax);
    }


    // Ejemplo de acción típica de un Pokémon Eléctrico
    public void cargarElectricidad() {
        System.out.println(nombre + " está cargando electricidad. Próximo ataque potenciado.");
    }
}
