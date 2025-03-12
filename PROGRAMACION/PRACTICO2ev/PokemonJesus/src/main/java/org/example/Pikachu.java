package org.example;

public class Pikachu extends Pokemon implements TipoElectrico{
    public Pikachu(String nombre, int nivel, double peso) {
        super(nombre, nivel, peso, "Electrico");
    }

    @Override
    public void ataqueImpactrueno() {
        System.out.println(getNombre() + " usa Impactrueno!");
    }

    @Override
    public void ataqueRapido() {
        System.out.println(getNombre() + " usa Ataque Rápido!");
    }
}
