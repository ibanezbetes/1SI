package acciones;

public class AccionMordisco extends Accion{

    public AccionMordisco(String nombre, int danio) {
        super(nombre, danio);
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
