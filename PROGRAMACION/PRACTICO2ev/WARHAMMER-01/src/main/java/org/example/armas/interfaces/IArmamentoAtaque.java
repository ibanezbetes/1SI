package org.example.armas.interfaces;

import org.example.personajes.WarhammerPersonaje;

public interface IArmamentoAtaque {
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);
}
