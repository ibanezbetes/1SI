package armas;

import personajes.WarhammerPersonaje;

public abstract class ArmaDefensa extends Arma implements iArmamentoDefensa {

    public ArmaDefensa(String nombre) {
        super(nombre);
    }

    public void defender(WarhammerPersonaje defendido,ArmaAtaque armaAtacante){

    }
}
