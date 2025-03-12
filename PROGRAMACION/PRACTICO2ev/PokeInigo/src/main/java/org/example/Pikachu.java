package org.example;

class Pikachu extends PokemonElectrico {
    public Pikachu(String nombre, int nivel, int psMax) {
        super(nombre, nivel, psMax);
    }


    public void generarChispa() {
        System.out.println(nombre + " generó una chispa eléctrica.");
    }
}
