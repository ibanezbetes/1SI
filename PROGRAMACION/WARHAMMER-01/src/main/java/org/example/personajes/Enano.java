package org.example.personajes;

import org.example.armas.interfaces.ArmaAtaque;
import org.example.armas.interfaces.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje{
    // private String nombre;
     private int riqueza;
     protected int nivel;
     private static int contEnanos;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }
    public static int getContEnanos(){
        return 0;
    }
     public void addArmaAtaque(ArmaAtaque arma){

    }
     public void addArmaDefensa(ArmaDefensa arma){

    }
    public String imprimirArmas(){
        //Recorrer HASH MAP,  y preparar cadena
        return "";
    }

    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }
}
