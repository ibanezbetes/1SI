package org.example.interfaces;

import org.example.armas.interfaces.ArmaAtaque;
import org.example.personajes.WarhammerPersonaje;

public interface ICombate {
    public void atacar(WarhammerPersonaje victima);
    public void defender(ArmaAtaque arma);
}
