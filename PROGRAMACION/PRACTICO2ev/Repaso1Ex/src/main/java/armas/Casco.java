package armas;

import personajes.WarhammerPersonaje;

public class Casco extends ArmaDefensa{

    private static final int DEFENSA_CASCO=2;

        public Casco(String nombre){
            super(nombre,DEFENSA_CASCO);
        }


    @Override // DEFENSA CASCO  -3
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        if (armaAtacante instanceof Arco){
            super.defender(defendido,armaAtacante);
        }else {
            defendido.restarEnergia(armaAtacante.getVIDA_CONSUMIDA());
        }
    }
}
