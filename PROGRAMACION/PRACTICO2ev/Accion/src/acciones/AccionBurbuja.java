package acciones;

public class AccionBurbuja extends Accion{

    public AccionBurbuja(String nombre, int danio) {
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
