package armas;

import personajes.WarhammerPersonaje;

public abstract class ArmaDefensa extends arma implements iArmamentoDefensa {


    public ArmaDefensa(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

    }
}
