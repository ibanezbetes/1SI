import java.util.Scanner;

public class Main {
    private static Lavadora[] lavadoras = new Lavadora[3];
    private static Prenda[] prendas = new Prenda[100]; // Máximo 100 prendas
    private static int contadorPrendas = 10; // Inicialmente 10 prendas

    public static void main(String[] args) {
        // Inicialización
        for (int i = 0; i < 3; i++) {
            lavadoras[i] = new Lavadora(10);
        }
        for (int i = 0; i < 10; i++) {
            prendas[i] = new Prenda("Camisa", "Azul", 2, "Medio");
        }

        // Menú principal similar al anterior, adaptado para arrays
    }

    private static void añadirPrenda(Scanner scanner) {
        if (contadorPrendas >= 100) {
            System.out.println("Máximo de prendas alcanzado");
            return;
        }

        // Lógica de entrada...
        prendas[contadorPrendas++] = new Prenda(tipo, color, peso, suciedad);
    }

    private static void operarLavadoras(Scanner scanner) {
        // Lógica similar usando índices y arrays
        Prenda[] prendasLavadora = lavadora.obtenerPrendas();
        for (Prenda p : prendasLavadora) {
            System.out.println(p.obtenerTipo());
        }
    }
}