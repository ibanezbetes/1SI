import java.util.Random;

public class MatrizAleatoria {
    private static int[][] matriz = new int[3][9];

    public static void llenarMatriz() {
        Random random = new Random();
        for (int columna = 0; columna < matriz[0].length; columna++) {
            int min = 10 + (columna * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual
            for (int row = 0; row < matriz.length; row++) {
                matriz[row][columna] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public static void ordenarColumnas() {
        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int i = 0; i < matriz.length - 1; i++) {
                for (int k = i + 1; k < matriz.length; k++) {
                    if (matriz[i][columna] > matriz[k][columna]) {
                        int numeroTemporal = matriz[i][columna];
                        matriz[i][columna] = matriz[k][columna];
                        matriz[k][columna] = numeroTemporal;
                    }
                }
            }
        }
    }

    public static void imprimirMatriz() {
        for (int row = 0; row < matriz.length; row++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                System.out.print(matriz[row][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        llenarMatriz();
        System.out.println("Matriz original: ");
        imprimirMatriz(); // imprime la matriz original

        ordenarColumnas();
        System.out.println("Matriz con columnas ordenadas: ");
        imprimirMatriz(); // imprime la matriz después de ordenar las columnas
    }
}
