package org.example.armas.interfaces;

import org.example.personajes.WarhammerPersonaje;

public class ArmaDefensa extends Arma implements IArmamentoDefensa{
    public ArmaDefensa(String nombre) {
        super(nombre);
    }
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

    }
}
