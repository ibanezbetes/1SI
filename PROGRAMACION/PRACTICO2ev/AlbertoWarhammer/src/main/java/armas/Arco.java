package armas;

import personajes.WarhammerPersonaje;

public class Arco extends ArmaAtaque{

    private final static int VIDA_CONSUMIDA=3;

    public Arco(String nombre) {
        super(nombre);
    }

    public static int getVidaConsumida(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }
}
