package armas;

import personajes.WarhammerPersonaje;

public interface iArmamentoAtaque {

    void atacar(WarhammerPersonaje victima);

    void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque);
}
