package acciones;

public class AccionLlamarada extends Accion{

    public AccionLlamarada(String nombre) {
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
