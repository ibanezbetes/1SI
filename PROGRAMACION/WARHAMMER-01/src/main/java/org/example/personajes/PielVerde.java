package org.example.personajes;

import org.example.armas.interfaces.ArmaAtaque;
import org.example.armas.interfaces.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje{
    // private String nombre;
     protected String puebloNacimiento;
     protected int nivel;
     private static int contPielesVerdes;

     public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }
     public static int getContPielesVerdes(){
        return 0;
    }
     public abstract void addArmaAtaque(ArmaAtaque arma);
     public abstract void addArmaDefensa(ArmaDefensa arma);
     public String imprimirArmas(){
        //Recorrer HASH MAP,  y preparar cadena
        return "";
    }

        @Override
        public String toString() {
            String cadImprimir = super.toString();
            cadImprimir += "PielVerde{" +
                    "puebloNacimiento='" + puebloNacimiento + '\'' +
                    ", nivel=" + nivel +
                    '}';
            return cadImprimir;
        }
    public abstract void atacar(WarhammerPersonaje victima);
    public abstract void defender(ArmaAtaque arma);
}
