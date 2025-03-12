package coches;

import interfaces.IServicio;
import interfaces.ITecnico;

import java.util.ArrayList;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double kilometraje;
    protected ArrayList serviciosRealizados;
    protected static int contadorVehiculos=0;

    public Vehiculo(String marca, String modelo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.serviciosRealizados=new ArrayList<>();
        contadorVehiculos++;
    }

    public void recibirServicio(IServicio servicio, ITecnico tecnico){
        // Paso 1: Ejecutar la lógica del técnico
        tecnico.realizarServicio(this, servicio);
        // Paso 2: Agregar el servicio a la lista de servicios realizados.
        serviciosRealizados.add(servicio);
    }

    public String getMarca(){
        return marca;
    }

    public ArrayList getServiciosRealizados() {
        return serviciosRealizados;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", serviciosRealizados=" + serviciosRealizados +
                '}';
    }
}
