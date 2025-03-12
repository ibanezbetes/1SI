package coches;

public class AutoElectrico extends Vehiculo{

    private double nivelBateria;


    public AutoElectrico(String marca, String modelo, double kilometraje,double nivelBateria) {
        super(marca, modelo, kilometraje);
        this.nivelBateria=nivelBateria;
    }

    public void recargarBateria(double cantidad){
         this.nivelBateria+=cantidad;

         if (this.nivelBateria> 100){
             this.nivelBateria=100;
         }

        System.out.println("Bateria recargada a " + this.nivelBateria);
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", nivelBateria=" + nivelBateria +
                '}';
    }
}
