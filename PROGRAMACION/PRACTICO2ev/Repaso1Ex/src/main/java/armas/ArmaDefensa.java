package armas;

import personajes.WarhammerPersonaje;

public abstract class ArmaDefensa extends Arma implements iArmamentoDefensa {

    protected final int VIDA_DEFENDIDA;

    public ArmaDefensa(String nombre,int vidaDefendida){
        super(nombre);
        this.VIDA_DEFENDIDA=vidaDefendida;

    }



    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        int danio= armaAtacante.getVIDA_CONSUMIDA()-this.VIDA_DEFENDIDA;
        if (danio<0){
            danio=0;
        }
        defendido.restarEnergia(danio);
    }
    }


