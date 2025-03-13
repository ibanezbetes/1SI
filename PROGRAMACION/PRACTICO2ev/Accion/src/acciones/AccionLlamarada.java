package acciones;

public class AccionLlamarada extends Accion{

    public AccionLlamarada(String nombre, int danio) {
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
