package armas;

import personajes.WarhammerPersonaje;

public class Arco extends ArmaAtaque{

    private static final int VIDA_CONSUMIDA=3;

    public Arco(String nombre) {
        super(nombre);
    }

    public static int getVIDA_CONSUMIDA(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque) {
        super.atacar(victima, esAtaqueTanque);
    }
}

