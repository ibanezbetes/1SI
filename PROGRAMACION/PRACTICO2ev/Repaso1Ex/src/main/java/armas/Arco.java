package armas;

import personajes.WarhammerPersonaje;

public class Arco extends ArmaAtaque {

    private static final int danio_arco=3;
        //ataque arco -2
    public Arco(String nombre){
        super(nombre,danio_arco);

    }

    public int getVIDA_CONSUMIDA(){
        return 0;
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque){

    }

    @Override
    public void atacar(WarhammerPersonaje victima){

    }
}
