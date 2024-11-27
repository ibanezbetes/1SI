import java.util.Scanner;
import java.util.Random;
public class Main {
    private static final int[][] tablero = new int[4][4];
    private static final boolean[][] revelados = new boolean[4][4];

    public static void main(String[] args) throws InterruptedException {
        inicializarTablero();
        Scanner scanner = new Scanner(System.in);
        while (!juegoTerminado()) {
            imprimirTablero();
            System.out.println("[PAREJA1] Escribe el número de fila: ");
            int fila1 = scanner.nextInt();
            System.out.println("[PAREJA1] Escribe el número de columna: ");
            int columna1 = scanner.nextInt();
            System.out.println("[PAREJA2] Escribe el número de fila: ");
            int fila2 = scanner.nextInt();
            System.out.println("[PAREJA2] Escribe el número de columna: ");
            int columna2 = scanner.nextInt();
            if ((fila1 == fila2 && columna1 == columna2) || !coordenadasValidas(fila1, columna1) || !coordenadasValidas(fila2, columna2)) {
                System.out.println("Coordenadas no válidas. Inténtalo de nuevo.");
                continue;
            }
            revelar(fila1, columna1);
            revelar(fila2, columna2);
            imprimirTablero();
            if (tablero[fila1][columna1] != tablero[fila2][columna2]) {
                System.out.println("¡No coinciden!");
                Thread.sleep(2000);
                System.out.println("");
                tapar(fila1, columna1);
                tapar(fila2, columna2);
            } else {
                System.out.println("¡Pareja encontrada!");
            }
        }
        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
    }

    private static void inicializarTablero() {
        int[] numeros = new int[4 * 4];
        for (int i = 0; i < 8; i++) {
            numeros[2 * i] = i + 1;
            numeros[2 * i + 1] = i + 1;
        }
        mezclarArray(numeros);
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = numeros[index++];
                revelados[i][j] = false;
            }
        }
    }

    private static void mezclarArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static boolean coordenadasValidas(int fila, int columna) {
        return fila >= 0 && fila < 4 && columna >= 0 && columna < 4 && !revelados[fila][columna];
    }

    private static void imprimirTablero() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (revelados[i][j]) {
                    System.out.print(tablero[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
    }

    private static void revelar(int fila, int columna) {
        revelados[fila][columna] = true;
    }

    private static void tapar(int fila, int columna) {
        revelados[fila][columna] = false;
    }

    private static boolean juegoTerminado() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!revelados[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}