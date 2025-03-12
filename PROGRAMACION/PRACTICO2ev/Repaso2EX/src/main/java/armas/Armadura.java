package armas;

import personajes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa{

    private static final int VIDA_DEFENDIDA=3;

    public Armadura(String nombre) {
        super(nombre);
    }

    public static int getVidaDefendida(){
        return VIDA_DEFENDIDA;
    }

    @Override
    public String toString() {
        return "Armadura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        super.defender(defendido, armaAtacante);
    }
}
