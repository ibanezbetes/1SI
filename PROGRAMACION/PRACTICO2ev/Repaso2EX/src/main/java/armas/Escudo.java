package armas;

import personajes.WarhammerPersonaje;

public class Escudo extends ArmaDefensa{

    private static final int VIDA_DEFENDIDA=2;

    public Escudo(String nombre) {
        super(nombre);
    }

    public static int getVidaDefendida(){
        return VIDA_DEFENDIDA;
    }

    @Override
    public String toString() {
        return "Escudo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        super.defender(defendido, armaAtacante);
    }
}
