package org.example.personajes;

import org.example.armas.interfaces.ArmaAtaque;
import org.example.armas.interfaces.ArmaDefensa;

import java.util.HashMap;

public class Goblin extends PielVerde{
    public Goblin(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }

    public void sumarEnergia(){

    }
    public void addArmaAtaque(ArmaAtaque armaAtaque){
        super.armas.put("ATAQUE", armaAtaque);
    }
    @Override
    public void addArmaDefensa(ArmaDefensa armaDefensa) {
        super.armas.put("DEFENSA", armaDefensa);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }
    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public String toString() {
        String cadImprimir = super.toString();
        cadImprimir += "Goblin{" +
                "nivel=" + nivel +
                ", armas=" + armas +
                '}';
        return cadImprimir;
    }

    /*@Override
    public String toString() {
        return "Goblin{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                ", nombre='" + nombre + '\'' +
                ", armas=" + armas +
                '}';
    }*/
}
