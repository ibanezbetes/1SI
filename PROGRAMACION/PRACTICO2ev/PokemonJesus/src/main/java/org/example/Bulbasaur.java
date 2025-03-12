package org.example;

public class Bulbasaur extends Pokemon implements TipoPlanta{

    public Bulbasaur(String nombre, int nivel, double peso) {
        super(nombre, nivel, peso, "Planta");
    }

    @Override
    public void ataqueLatigoCepa() {
        System.out.println(getNombre() + "usa Latigo Cepa");
    }

    @Override
    public void ataqueDrenadoras() {
        System.out.println(getNombre() + "usa Drenadores");
    }
}
