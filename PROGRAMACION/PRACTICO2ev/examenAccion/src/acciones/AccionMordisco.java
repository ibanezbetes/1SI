package acciones;

public class AccionMordisco extends Accion{

    public AccionMordisco(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public int ejecutarAccion() {
        return 0;
    }
}
