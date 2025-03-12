package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje {


    protected String puebloNacimiento;
    protected int nivel;
    protected static int contPielesVerdes=0;

    public PielVerde(String nombre,String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento=puebloNacimiento;
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
        return super.toString() +
                "PielVerde{" +
                "nombre='" + nombre + '\'' +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
