package batallas;

import personajes.WarhammerPersonaje;

import java.util.ArrayList;

public class Guerra {

    private String nombre;
    private ArrayList<Escaramuza>lstEscaramuzas;

    public Guerra(String nombre) {
        this.nombre = nombre;
        this.lstEscaramuzas = new ArrayList<>();
    }

    public void addEscaramuza(Escaramuza batalla){
        lstEscaramuzas.add(batalla);
    }

    public void addPersonajeAEscaramuza(String tipo,Escaramuza batalla, WarhammerPersonaje personaje){
        batalla.addPersonajes(tipo,personaje);
    }

    public void imprimirGuerra(){
        System.out.println("Guerra");
        for (Escaramuza escaramuza : lstEscaramuzas) {
            System.out.println(escaramuza.imprimirEscaramuza());
        }
    }

    @Override
    public String toString() {
        return "Guerra{" +
                "nombre='" + nombre + '\'' +
                ", lstEscaramuzas=" + lstEscaramuzas +
                '}';
    }
}
