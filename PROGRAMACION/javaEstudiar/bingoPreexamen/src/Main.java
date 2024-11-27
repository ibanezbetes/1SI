import java.util.Random; // Importa la clase Random para generar números aleatorios

public class Main { // Declara la clase principal del programa
    static Random aleatorio = new Random(); // Crea una instancia de Random llamada aleatorio
    static final int MAX_FILA = 3; // Define el número máximo de filas como 3
    static final int MAX_COLUMNA = 9; // Define el número máximo de columnas como 9
    static int tablero[][] = new int[MAX_FILA][MAX_COLUMNA]; // Declara una matriz bidimensional de tamaño 3x9

    public static void definirArray() { // Metodo para inicializar y llenar el array tablero
        // Inicializa todas las posiciones del tablero con -1
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero[i][j] = -1; // Asigna -1 a la posición [i][j]
            }
        }

        // Recorre cada columna del tablero
        for (int j = 0; j < MAX_COLUMNA; j++) {
            int[] numerosColumna = new int[MAX_FILA]; // Crea un array temporal para almacenar los números de la columna
            int indice = 0; // Inicializa el índice para controlar la posición en numerosColumna

            // Genera números aleatorios únicos para la columna actual
            while (indice < MAX_FILA) {
                int randomizado = aleatorio.nextInt(10) + (j * 10) + 10; // Genera un número aleatorio en el rango específico de la columna

                boolean repetidoEnColumna = false; // Bandera para verificar si el número ya existe en la columna
                // Verifica si el número ya está en numerosColumna
                for (int k = 0; k < indice; k++) {
                    if (numerosColumna[k] == randomizado) {
                        repetidoEnColumna = true; // Si está repetido, cambia la bandera a true
                        break; // Sale del bucle si se encuentra un número repetido
                    }
                }

                if (!repetidoEnColumna) { // Si el número no está repetido
                    numerosColumna[indice] = randomizado; // Lo agrega al array numerosColumna
                    indice++; // Incrementa el índice para la siguiente posición
                }
            }

            // Ordena los números de la columna de menor a mayor utilizando el metodo de burbuja
            for (int i = 0; i < MAX_FILA - 1; i++) {
                for (int k = 0; k < MAX_FILA - i - 1; k++) {
                    if (numerosColumna[k] > numerosColumna[k + 1]) {
                        int temp = numerosColumna[k]; // Intercambia los elementos si están en el orden incorrecto
                        numerosColumna[k] = numerosColumna[k + 1];
                        numerosColumna[k + 1] = temp;
                    }
                }
            }

            // Asigna los números ordenados al tablero en la columna actual
            for (int i = 0; i < MAX_FILA; i++) {
                tablero[i][j] = numerosColumna[i]; // Asigna el número a la posición [i][j] del tablero
            }
        }
    }

    public static void imprimirArray() { // Metodo para imprimir el contenido del tablero
        for (int i = 0; i < MAX_FILA; i++) { // Recorre cada fila
            for (int j = 0; j < MAX_COLUMNA; j++) { // Recorre cada columna
                System.out.print(tablero[i][j] + " "); // Imprime el valor en la posición [i][j] seguido de un espacio
            }
            System.out.println(); // Imprime un salto de línea después de cada fila
        }
    }

    public static void main(String[] args) { // Metodo principal del programa
        definirArray(); // Llama al metodo para inicializar y llenar el tablero
        imprimirArray(); // Llama al metodo para imprimir el tablero
    }
}
