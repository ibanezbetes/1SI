package personajes;

import armas.ArmaAtaque;

public interface iCombate {

    void atacar(WarhammerPersonaje victima);

    void defender(ArmaAtaque arma);
}
