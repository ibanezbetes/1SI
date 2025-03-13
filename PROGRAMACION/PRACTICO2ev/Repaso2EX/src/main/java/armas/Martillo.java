package armas;

public class Martillo extends ArmaAtaque{

    private static final int VIDA_CONSUMIDA=3;

    public Martillo(String nombre) {
        super(nombre);
    }

    public static int getVIDA_CONSUMIDA(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Martillo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

