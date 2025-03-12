package armas;

public class Martillo extends ArmaAtaque{

    private final static int VIDA_CONSUMIDA=3;

    public Martillo(String nombre) {
        super(nombre);
    }

    public static int getVidaConsumida(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Martillo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
