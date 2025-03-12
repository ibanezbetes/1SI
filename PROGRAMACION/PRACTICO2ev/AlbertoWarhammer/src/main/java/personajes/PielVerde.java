package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje{

    protected String puebloNacimiento;
    protected int nivel;
    private static int contPielesVerdes=0;

    public PielVerde(String nombre, String puebloNacimiento, int nivel) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
        this.nivel=nivel;
    }

    public static int getContPielesVerdes(){
        return contPielesVerdes;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    public String imprimirArmas(){
        //recorrer hasmap y preparar cadena
        return "";
    }

    @Override
    public String toString() {
        return "PielVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
