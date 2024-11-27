import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int MAX_FILA = 10;
    static final int MAX_COLUMNA = 10;
    static Random aleatorio = new Random();
    static int tableroX[][] = new int[MAX_FILA][MAX_COLUMNA];
    static int tableroNumeros[][] = new int[MAX_FILA][MAX_COLUMNA];
    static int tableroGanador[][] = new int[MAX_FILA][MAX_COLUMNA];

    static void definirArrayX() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroX[i][j] = -1;
            }
        }
    }

    public static void definirArrayNumeros() {
        int randomizado;
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                randomizado = aleatorio.nextInt(90) + 10;
                tableroNumeros[i][j] = randomizado;
            }
        }
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tableroX[i][j] == -1) {
                    System.out.print("XX ");
                } else {
                    System.out.print(tableroX[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void leerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("....................................");
        System.out.println("....................................");
        System.out.println("Introduce 10 números entre 10 y 99: ");
        for (int n = 0; n < 10; n++) {
            int numeroUsuario;
            boolean valido;
            do {
                System.out.println("..................");
                System.out.println("..................");
                System.out.print("Número " + (n + 1) + ": ");
                numeroUsuario = sc.nextInt();
                valido = (numeroUsuario >= 10 && numeroUsuario <= 99);
                if (!valido) {
                    System.out.println("....................................");
                    System.out.println("....................................");
                    System.out.println("Por favor, introduce un número entre 10 y 99: ");
                }
            } while (!valido);
            for (int i = 0; i < MAX_FILA; i++) {
                for (int j = 0; j < MAX_COLUMNA; j++) {
                    if (tableroNumeros[i][j] == numeroUsuario) {
                        tableroX[i][j] = numeroUsuario;
                    }
                }
            }
            imprimirArray(tableroGanador);
        }
    }

    public static void main(String[] args) {
        definirArrayX();
        definirArrayNumeros();
        imprimirArray(tableroX);
        leerNumeros();
        System.out.println(".............................................");
        System.out.println(".............................................");
        System.out.println("Tablero Ganador (solo los números acertados):");
        imprimirArray(tableroGanador);
    }
}
