import java.util.Scanner;

public class JuegoMemoria {

    // Lista de palabras a memorizar
    static String[] palabras = {"sol", "luna", "estrella", "cielo", "mar", "montaña", "río", "nube", "flor", "árbol"};
    static String[] respuestas = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iniciarJuego(scanner);
        scanner.close();
    }

    public static void iniciarJuego(Scanner scanner) {
        for (int i = 0; i < palabras.length; i++) {
            mostrarPalabra(i);
            respuestas[i] = palabras[i];

            String entrada = pedirEntrada(scanner);

            if (!verificarRespuesta(entrada, i)) {
                mostrarMensajeIncorrecto(i);
                i = -1; // Reiniciar el juego
            } else {
                System.out.println("¡Correcto! Sigue a la siguiente palabra.\n");
            }
        }
        System.out.println("¡Felicidades! Has memorizado todas las palabras correctamente.");
    }

    public static void mostrarPalabra(int indice) {
        System.out.println("Palabra a memorizar: " + palabras[indice]);
    }

    public static String pedirEntrada(Scanner scanner) {
        System.out.print("Escribe todas las palabras memorizadas hasta ahora: ");
        return scanner.nextLine();
    }

    public static boolean verificarRespuesta(String entrada, int hasta) {
        StringBuilder correctas = new StringBuilder();
        for (int j = 0; j <= hasta; j++) {
            correctas.append(respuestas[j]).append(" ");
        }
        return entrada.equals(correctas.toString().trim());
    }


    public static void mostrarMensajeIncorrecto(int hasta) {
        StringBuilder correctas = new StringBuilder();
        for (int j = 0; j <= hasta; j++) {
            correctas.append(respuestas[j]).append(" ");
        }
        System.out.println("¡Incorrecto! La secuencia era: " + correctas.toString().trim());
        System.out.println("Intenta de nuevo desde el inicio.");
    }
}
