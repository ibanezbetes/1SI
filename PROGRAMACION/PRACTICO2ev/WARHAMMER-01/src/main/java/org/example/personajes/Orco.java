package org.example.personajes;

import org.example.armas.interfaces.ArmaAtaque;
import org.example.armas.interfaces.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde{
    private ArrayList<Goblin> listaGoblin;

    public Orco(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {

    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }
    @Override
    public void defender(ArmaAtaque arma) {

    }
}
