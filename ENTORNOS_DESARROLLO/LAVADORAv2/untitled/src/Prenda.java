package Lavadora;

public class Prenda {
    private String nombre;
    private double peso;         // Peso de la prenda en kg
    private int nivelSuciedad;   // Nivel de suciedad de 0 (limpia) a 100 (muy sucia)

    // NUEVO: indica si esta prenda está disponible para cargar en la lavadora
    private boolean disponible;

    public Prenda(String nombre, double peso, int nivelSuciedad) {
        this.nombre = nombre;
        this.peso = peso;
        this.nivelSuciedad = nivelSuciedad;
        this.disponible = true; // Por defecto, al crear una prenda, está disponible
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getNivelSuciedad() {
        return nivelSuciedad;
    }

    public void setNivelSuciedad(int nivelSuciedad) {
        this.nivelSuciedad = nivelSuciedad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", nivelSuciedad=" + nivelSuciedad +
                ", disponible=" + disponible +
                '}';
    }
}
