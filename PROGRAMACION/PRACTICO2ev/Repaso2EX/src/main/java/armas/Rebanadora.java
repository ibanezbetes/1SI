package armas;

public class Rebanadora extends ArmaAtaque{

    private static final int VIDA_CONSUMIDA=5;

    public Rebanadora(String nombre) {
        super(nombre);
    }

    public static int getVIDA_CONSUMIDA(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Rebanadora{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

