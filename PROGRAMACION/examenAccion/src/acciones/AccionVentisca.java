package acciones;

public class AccionVentisca extends Accion{

    public AccionVentisca(String nombre) {
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
