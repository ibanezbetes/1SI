package Modulo;

import Naves.Nave;

import java.util.ArrayList;

public class Capitan {

    private String nombre;
    private ArrayList<Nave> flota;
    private ArrayList<Modulo> inventario;

    public Capitan(String nombre) {
        this.nombre = nombre;
    }

    public void añadirNave(Nave n){

    }

    public void añadirModulo(Modulo m){

    }

    public void usarModulo(Modulo m,Nave n){

    }

    @Override
    public String toString() {
        return "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                ", inventario=" + inventario +
                '}';
    }
}
