package org.example;

public class Squirtle extends Pokemon implements TipoAgua{
    public Squirtle(String nombre, int nivel, double peso) {
        super(nombre, nivel, peso, "Agua");
    }

    @Override
    public void ataqueHidropulso() {
        System.out.println(getNombre() + " usa Hidropulso!");
    }

    @Override
    public void ataqueBurbuja() {
        System.out.println(getNombre() + " usa Burbuja!");
    }
}
