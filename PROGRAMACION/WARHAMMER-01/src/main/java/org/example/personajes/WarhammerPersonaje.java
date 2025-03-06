package org.example.personajes;

import org.example.armas.interfaces.Arma;
import org.example.armas.interfaces.ArmaAtaque;
import org.example.interfaces.ICombate;

import java.util.HashMap;

public abstract class WarhammerPersonaje implements ICombate {
    protected String nombre;
    private int energia;
     protected HashMap<String, Arma> armas;
    private static int contPersonajes;
    private static final int ENERGIA_MAX = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }
    public void sumarEnergia(){

    }
    public static void toNumPersonajes(){
        System.out.println("");
        //return int
    }
    public String imprimirArmas(){
        return "";
    }
    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }
    public abstract void atacar(WarhammerPersonaje victima);
    public abstract void defender(ArmaAtaque arma);
}
