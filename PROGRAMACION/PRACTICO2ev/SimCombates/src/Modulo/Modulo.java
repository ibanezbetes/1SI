package Modulo;

import Naves.Nave;

public abstract class Modulo {

    protected String nombreModulo;

    public Modulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void usar(Nave n){

    }
}
