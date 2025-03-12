package Naves;

import Modulo.ArmaAtaque;
import Modulo.ArmaDefensa;
import Modulo.Modulo;
import interfaces.IAtaque;
import interfaces.IDefensa;

import java.util.ArrayList;

public abstract class Nave implements IAtaque, IDefensa {

    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX=100;
    protected ArrayList<Modulo> listModulos;

    public Nave(String nombre) {
        this.nombre = nombre;
        this.listModulos=new ArrayList<>();
        this.salud = SALUD_MAX;
    }

    public void atacar(Nave objetivo){

    }

    public void defender(ArmaAtaque arma){

    }

    public ArmaAtaque getArmaAtaque(){
        return null;
    }

    public ArmaDefensa getArmaDefensa(){
        return null;
    }

    public void restarSalud(int dmg){

    }

    public boolean estaOperativa(){
        return false;
    }

    public void ataqueEspecial(Nave objetivo){

    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", SALUD_MAX=" + SALUD_MAX +
                '}';
    }
}
