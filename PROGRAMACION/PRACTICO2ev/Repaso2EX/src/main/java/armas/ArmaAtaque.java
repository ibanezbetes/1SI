package armas;

import personajes.WarhammerPersonaje;

public class ArmaAtaque extends Arma implements iArmamentoAtaque{

    public ArmaAtaque(String nombre) {
        super(nombre);
    }

    public void atacar(WarhammerPersonaje victima){

    }

    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque){

    }
}
