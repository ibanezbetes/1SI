package cosas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Videojuego {

    private String nombre;
    private String descripcion;
    private double precio;
    private Desarrollador desarrollador;
    private Genero genero;
    private ArrayList plataformas;
    private ArrayList calificaciones;
    private Date fechaCreacion;



    public Videojuego(String nombre, double precio, Desarrollador desarrollador, Genero genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.calificaciones = new ArrayList<>();
        this.plataformas = new ArrayList<>();
    }

    public void calificar(int puntuacion){

    }

    public double getPuntuacionMedia(){
        return 0;
    }

    public boolean comprar(Usuario usuario){
      return false;
    }

    public double getPrecio() {
        return precio;
    }

    public void agregarPlataforma(Plataforma p){

    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", desarrollador=" + desarrollador +
                ", genero=" + genero +
                '}';
    }
}
