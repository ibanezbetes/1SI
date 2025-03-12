package armas;

import personajes.WarhammerPersonaje;

public class Escudo extends ArmaDefensa{

    private static final int DEFENSA_ESCUDO=2;

    public Escudo(String nombre){
        super(nombre,DEFENSA_ESCUDO);

    }

    @Override
    public String toString() {
        return "Escudo{" +
                "VIDA_DEFENDIDA=" + VIDA_DEFENDIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override  //DEFENSA ESCUDO     -4
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){
        if (armaAtacante instanceof Martillo || armaAtacante instanceof Hacha){
            super.defender(defendido,armaAtacante);
        }else {
            defendido.restarEnergia(armaAtacante.getVIDA_CONSUMIDA());
        }
    }
}
