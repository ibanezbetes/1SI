package armas;

import personajes.WarhammerPersonaje;

public class Casco extends ArmaDefensa{

    private static final int VIDA_DEFENDIDA=2;

    public Casco(String nombre) {
        super(nombre);
    }

    public static int getVidaDefendida(){
        return VIDA_DEFENDIDA;
    }

    @Override
    public String toString() {
        return "Casco{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        super.defender(defendido, armaAtacante);
    }
}
