package armas;

public class Rebanadora extends ArmaAtaque{

    private final static int VIDA_CONSUMIDA=5;

    public Rebanadora(String nombre) {
        super(nombre);
    }

    public static int getVidaConsumida(){
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Rebanadora{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
