package armas;

public class Rebanadora extends ArmaAtaque {

    private static final int DANIO_RABANADORA=5;

    public Rebanadora(String nombre) {
        super(nombre,DANIO_RABANADORA);
    }


    @Override
    public String toString() {
        return "Rebanadora{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                '}';
    }
}
