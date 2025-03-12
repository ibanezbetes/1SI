package armas;

public class Hacha extends ArmaAtaque{

    private final static int VIDA_CONSUMIDA=5;

    public Hacha(String nombre) {
        super(nombre);
    }

    public static int getVidaConsumida(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
