package armas;

public class Hacha extends ArmaAtaque{

    private static final int VIDA_CONSUMIDA=5;

    public Hacha(String nombre) {
        super(nombre);
    }

    public static int getVIDA_CONSUMIDA(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

