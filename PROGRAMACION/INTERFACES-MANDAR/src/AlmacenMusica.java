// package org.example;

import java.util.ArrayList;

public class AlmacenMusica implements IEstanteria{
    ArrayList<Cancion> lstCanciones;

    /* public AlmacenMusica(ArrayList<Cancion> lstCanciones) {
        this.lstCanciones = lstCanciones;
    } */

    public AlmacenMusica() {
        this.lstCanciones = new ArrayList<Cancion>();
    }

    @Override
    public void addCancion(Cancion c) {
        //if(c!=null) {
        //  this.lstCanciones.add(c);
        // }
        if (c == null) {
            System.out.println("Campo vacío.");
            return;
        }
        lstCanciones.add(c);
        System.out.println("Canción añadida: " + c.getTitulo());
    }


    @Override
    public void updateCancion(Cancion c) {
        // if(c != null) {
        // int id = c.getId();
        // for (Cancion cancion:this.lstCanciones
        // ) {
        // if(cancion.getId() == id){
        // }
        if (c == null) {
            System.out.println("No se puede actualizar.");
            return;
        }

        // Se asume que el título es único para cada canción.
        boolean encontrada = false;
        for (int i = 0; i < lstCanciones.size(); i++) {
            if (lstCanciones.get(i).getTitulo().equals(c.getTitulo())) {
                // Actualizamos los atributos de la canción encontrada.
                lstCanciones.get(i).setAutor(c.getAutor());
                lstCanciones.get(i).setGenero(c.getGenero());
                lstCanciones.get(i).setAnio(c.getAnio());
                System.out.println("Canción actualizada: " + c.getTitulo());
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró la canción para actualizar: " + c.getTitulo());
        }
    }


    @Override
    public void deleteCancion(Cancion c) {
        this.lstCanciones.remove(c);
    }


    @Override
    public void imprimir() {
        if (lstCanciones.isEmpty()) {
            System.out.println("No hay canciones en el almacén.");
            return;
        }

        System.out.println("Canciones en el almacén:");
        for (Cancion c : lstCanciones) {
            System.out.println(c);
        }
    }

}

/*
package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class AlmacenMusica implements IEstanteria{
    ArrayList<Cancion> lstCanciones;
    HashMap<Integer,Cancion> hashMapCanciones;

    private Random aleatorio;

    /* public AlmacenMusica(ArrayList<Cancion> lstCanciones) { this.lstCanciones = lstCanciones; } */ /*public AlmacenMusica() {
        this.lstCanciones = new ArrayList<Cancion>();
        this.hashMapCanciones = new HashMap<>();
        this.aleatorio = new Random();
    }

    @Override
    public void addCancion(Cancion c) {
        if(c!=null){
            c.setId(aleatorio.nextInt(100) + 1); // Simulando que es el // ID AUTONUMÉRICO DE BD this.lstCanciones.add(c);
        }
    }
    public void addCancionHashMap(Cancion c) {
        if(c!=null){
            c.setId(aleatorio.nextInt(100) + 1); // Simulando que es el // ID AUTONUMÉRICO DE BD this.hashMapCanciones.
            put(aleatorio.nextInt(100) + 1, c);
        }
    }
    public Cancion getCancion(Cancion cancion){
        this.hashMapCanciones.get(cancion.getId());
        for (Cancion cancionTemporal: this.lstCanciones
        ) {
            if(cancion.getId() == cancionTemporal.getId()){
                System.out.println("ENCONTRADO");
                break;
            }
        }
    }
    @Override
    public void updateCancion(Cancion c) {
        if(c != null){
            int id = c.getId();
            for (Cancion cancion:this.lstCanciones
            ) {
                if(cancion.getId() == id){
                    cancion.setTitle(c.getTitle());
                }
            }
        }
    }

    @Override
    public void deleteCancion(Cancion c) {
        this.lstCanciones.remove(c);
    }

    @Override
    public void imprimir() {
        for (Cancion cancion:lstCanciones
        ) {
            System.out.println(cancion.toString());
        }
    }
}

*/