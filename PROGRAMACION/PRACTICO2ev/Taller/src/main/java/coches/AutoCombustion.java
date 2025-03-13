package coches;

public class AutoCombustion extends Vehiculo{

    private double nivelCombustible;
    private double capacidadTanque;

    public AutoCombustion(String marca, String modelo, double kilometraje,double capacidadTanque, double nivelCombustible) {
        super(marca, modelo, kilometraje);
        this.capacidadTanque=capacidadTanque;
        this.nivelCombustible=nivelCombustible;
    }


    public void llenarTanque(double litros) {
        this.nivelCombustible += litros;
        if (this.nivelCombustible > capacidadTanque) {
            this.nivelCombustible = capacidadTanque;
        }
        System.out.println("Tanque llenado. Ahora tiene " + nivelCombustible + " / " + capacidadTanque + " litros.");
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public String toString() {
        return "AutoCombustion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", nivelCombustible=" + nivelCombustible +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
