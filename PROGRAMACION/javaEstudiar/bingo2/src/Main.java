import java.util.Random;

public class Main {
    static final int MAX_FILA = 3;
    static final int MAX_COLUMNA = 9;
    static Random aleatorio = new Random();
    static int tablero[][] = new int[MAX_FILA][MAX_COLUMNA];

    public static void imprimirArray() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void definirArray() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero[i][j] = -1;
            }
        }

        for (int j = 0; j < MAX_COLUMNA; j++) {
            int[] numerosColumna = new int[MAX_FILA];

            for (int contador = 0; contador < MAX_FILA; contador++) {
                int randomizado = aleatorio.nextInt(10) + (j * 10) + 10;
                numerosColumna[contador] = randomizado;
            }

            for (int i = 0; i < MAX_FILA-1; i++) {
                for (int k = 0; k < MAX_FILA - i - 1; k++) {
                    if (numerosColumna[k] > numerosColumna[k+1]) {
                        int temporal = numerosColumna[k];
                        numerosColumna[k] = numerosColumna[k+1];
                        numerosColumna[k+1] = temporal;
                    }
                }
            }

            for (int i = 0; i < MAX_FILA; i++) {
                tablero[i][j] = numerosColumna[i];
            }
        }
    }

    public static void main(String[] args) {

        definirArray();
        imprimirArray();

    }
}