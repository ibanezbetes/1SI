package criaturas;

import acciones.Accion;
import interfaces.IAccion;

import java.util.ArrayList;

public abstract class Criatura {

    protected String nombre;
    protected int vida;
    protected ArrayList <Accion> acciones;

    public Criatura(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.acciones=new ArrayList<>();
    }

    public void aprenderAccion(Accion accion){
        acciones.add(accion);


    }

    public void atacar(Criatura enemigo, Accion accion){
        

    }

    public void recibirAtaque(int danio,Criatura atacante){

    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre= '" + nombre + '\'' +
                ", Vida= " + vida +
                '}';
    }
}