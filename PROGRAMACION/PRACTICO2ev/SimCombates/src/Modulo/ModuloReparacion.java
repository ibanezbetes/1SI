package Modulo;

import Naves.Nave;

public class ModuloReparacion extends Modulo{

    private int puntosReparar;


    public ModuloReparacion(String nombre, int p) {
        super(nombre);
        this.puntosReparar = p;
    }


    public void usar(Nave n) {

    }
}
