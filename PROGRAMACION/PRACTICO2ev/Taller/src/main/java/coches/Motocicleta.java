package coches;

public class Motocicleta extends Vehiculo {

    private String tipoCasco;

    public Motocicleta(String marca, String modelo, double kilometraje,String tipoCasco) {
        super(marca, modelo, kilometraje);
        this.tipoCasco=tipoCasco;
    }

    public void verificarCasco(){
        System.out.println(" Tipo de casco del usuario " + tipoCasco);
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", tipoCasco='" + tipoCasco + '\'' +
                ", serviciosRealizados=" + serviciosRealizados +
                '}';
    }
}
