package acciones;

public class AccionVentisca extends Accion{

    public AccionVentisca(String nombre, int danio) {
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
