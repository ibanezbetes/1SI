package armas;

import personajes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa{

    private static final int DEFENSA_ARMADURA=3;

    public Armadura(String nombre){
        super(nombre,DEFENSA_ARMADURA);
    }

    //DEFENSA ARAMADURA ES LO MISMO QUE ARMA DERFENSA   -5

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

    }
}
