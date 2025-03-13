package armas;

import personajes.WarhammerPersonaje;

public class ArmaAtaque extends Arma implements iArmamentoAtaque{

    protected final int VIDA_CONSUMIDA;

    public ArmaAtaque(String nombre,int VIDA_CONSUMIDA){
        super(nombre);
        this.VIDA_CONSUMIDA=VIDA_CONSUMIDA;

    }

    public int getVIDA_CONSUMIDA(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public void atacar(WarhammerPersonaje victima){

    }

    @Override
    public void atacar(WarhammerPersonaje victima,boolean esAtaqueTanque){

    }
}
