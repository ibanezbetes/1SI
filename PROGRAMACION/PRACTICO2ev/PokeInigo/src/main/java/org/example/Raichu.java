package org.example;

class Raichu extends PokemonEvolucionado {
    public Raichu(String nombre, int nivel, int psMax, int bonificacionEvo) {
        super(nombre, nivel, psMax, bonificacionEvo);
    }


    public void truenoDePotencia() {
        System.out.println(nombre + " usa Trueno de Potencia, ¡gran daño eléctrico!");
    }
}
