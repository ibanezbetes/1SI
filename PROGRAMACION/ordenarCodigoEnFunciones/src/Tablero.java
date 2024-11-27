import java.util.Random;

public class Tablero {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 9;
        int[][] tablero = new int[filas][columnas];

        llenarTablero(tablero, filas, columnas);
        ordenarColumnas(tablero, filas, columnas);
        imprimirTablero(tablero, filas, columnas);
    }

    public static void llenarTablero(int[][] tablero, int filas, int columnas) {
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Generar números aleatorios en el rango [10*(j+1), 10*(j+1)+9]
                int numAleatorio = random.nextInt(10) + 10 * (j + 1);
                tablero[i][j] = numAleatorio;
            }
        }
    }

    public static void ordenarColumnas(int[][] tablero, int filas, int columnas) {
        for (int columna = 0; columna < columnas; columna++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = i + 1; j < filas; j++) {
                    if (tablero[i][columna] > tablero[j][columna]) {
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }
        }
    }

    public static void imprimirTablero(int[][] tablero, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
