package servicios;

import coches.Vehiculo;
import interfaces.ITecnico;

import java.util.ArrayList;

public class Taller {

    private String nombre;
    private ArrayList vehiculosEnServicio = new ArrayList<>();
    private ITecnico tecnico;

    public Taller(String nombre, ITecnico tecnico) {
        this.nombre = nombre;
        this.tecnico = tecnico;
    }

    public void admitirVehiculo(Vehiculo v){
        vehiculosEnServicio.add(v);
        System.out.println("Vehiculo" + v +  "admitido con dicha marca y modelo" + v.getMarca() + ',' + v.getModelo() );
    }

    public void procesarServiciosPendientes() {
        System.out.println("Iniciando el procesamiento de servicios en el taller " + nombre);

        for (Object obj : vehiculosEnServicio) {
            Vehiculo v = (Vehiculo) obj;

            v.recibirServicio(new AjusteFrenos(), tecnico);

            v.recibirServicio(new RevisionGeneral(), tecnico);
        }

        System.out.println("Todos los servicios pendientes han sido procesados en el taller "
                + nombre + ".");
    }


    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", vehiculosEnServicio=" + vehiculosEnServicio +
                ", tecnico=" + tecnico +
                '}';
    }
}



