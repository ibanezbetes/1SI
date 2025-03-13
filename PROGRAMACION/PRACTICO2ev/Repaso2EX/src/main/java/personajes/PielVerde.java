package personajes;

import armas.Arma;
import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.HashMap;

public abstract class PielVerde extends WarhammerPersonaje implements iCombate {

    private String nombre;
    protected String puebloNacimiento;
    protected int nivel;
    private static int contPielesVerdes=0;

    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    public static int getContPielesVerdes(){
        return contPielesVerdes;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    public String imprimirArmas(){
        return "";
    }

    @Override
    public String toString() {
        return "PielVerde{" +
                "nombre='" + nombre + '\'' +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
