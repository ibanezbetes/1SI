package acciones;

import interfaces.IAccion;

public abstract class Accion implements IAccion {

    private String nombre;
    private int danio;

    public Accion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int ejecutarAccion() {
        return danio;
    }
}
