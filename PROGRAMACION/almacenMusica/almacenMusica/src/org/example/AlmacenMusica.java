package org.example;

import java.util.ArrayList;

public class AlmacenMusica {
    /// INTERMEDIARIO
    // AÑADIR UNA PELÍCULA
    // ALMACÉN ESTÁTICO
    // LISTAS   (PENDIENTE CON ALBERTO)
    // ARRAYLIST (AHORA)
    private ArrayList<Cancion> listaDeCanciones;
    // IKEA -> OPTIMIZACIÓN DE MEMORIA

    public AlmacenMusica() {
        this.listaDeCanciones = new ArrayList<>(); // nodo
    }

    public static void addCancion(){

    }
    public  void addCancionPrueba(Cancion cancion){
        listaDeCanciones.add(cancion);
    }
    public void imprimirCanciones(){
        for (Cancion cancion: listaDeCanciones
        ) {
            cancion.toString();
        }
    }