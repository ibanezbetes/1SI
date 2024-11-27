import java.util.Random;

public class Main {
    private static final int MAX_FILA_TABLERO = 10; // Tamaño máximo de filas del tablero.
    private static final int MAX_COLUMNA_TABLERO = 10; // Tamaño máximo de columnas del tablero.
    public static char[][] tablero1; // Tablero de juego 1.
    public static char[][] tablero2; // Tablero de juego 2.
    private static int filaYoda; // Posición actual de la fila de Yoda.
    private static int columnaYoda; // Posición actual de la columna de Yoda.
    private static int filaVader; // Posición actual de la fila de Vader.
    private static int columnaVader; // Posición actual de la columna de Vader.
    static int vidasVader = 3; // Cantidad inicial de vidas de Vader.
    static int vidasYoda = 3; // Cantidad inicial de vidas de Yoda.


    private static void asignarLibresATablero1(char caracter) {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // Recorre todas las filas del tablero1.
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) { // Recorre todas las columnas del tablero1.
                tablero1[i][j] = caracter; // Asigna el carácter a la celda actual del tablero1.
            }
        }
    }

    private static void asignarLibresATablero2(char caracter) {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // Recorre todas las filas del tablero2.
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) { // Recorre todas las columnas del tablero2.
                tablero2[i][j] = caracter; // Asigna el carácter a la celda actual del tablero2.
            }
        }
    }

    private static void asignarPersonajesATablero1(char caracter, int numRepeticiones) {
        Random aleatorio = new Random(); // Objeto Random para generar posiciones aleatorias.
        int filaAleatorioYoda = -1; // Inicializa la fila aleatoria de Yoda.
        int columnaAleatorioYoda = -1; // Inicializa la columna aleatoria de Yoda.
        for (int i = 0; i < numRepeticiones; i++) { // Bucle para colocar cada personaje.
            do {
                filaAleatorioYoda = aleatorio.nextInt(MAX_FILA_TABLERO); // Genera una fila aleatoria.
                columnaAleatorioYoda = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // Genera una columna aleatoria.
            } while (tablero1[filaAleatorioYoda][columnaAleatorioYoda] != 'L'); // Repite si no está libre.
            tablero1[filaAleatorioYoda][columnaAleatorioYoda] = caracter; // Coloca el carácter en la posición.
        }
        if (caracter == 'Y') { // Si el carácter es Yoda, almacena su posición inicial.
            filaYoda = filaAleatorioYoda;
            columnaYoda = columnaAleatorioYoda;
        }
    }

    private static void asignarPersonajesATablero2(char caracter, int numRepeticiones) {
        Random aleatorio = new Random(); // Objeto Random para generar posiciones aleatorias.
        int filaAleatorioVader = -1; // Inicializa la fila aleatoria de Vader.
        int columnaAleatorioVader = -1; // Inicializa la columna aleatoria de Vader.
        for (int i = 0; i < numRepeticiones; i++) { // Bucle para colocar cada personaje.
            do {
                filaAleatorioVader = aleatorio.nextInt(MAX_FILA_TABLERO); // Genera una fila aleatoria.
                columnaAleatorioVader = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // Genera una columna aleatoria.
            } while (tablero2[filaAleatorioVader][columnaAleatorioVader] != 'L'); // Repite si no está libre.
            tablero2[filaAleatorioVader][columnaAleatorioVader] = caracter; // Coloca el carácter en la posición.
        }
        if (caracter == 'V') { // Si el carácter es Vader, almacena su posición inicial.
            filaVader = filaAleatorioVader;
            columnaVader = columnaAleatorioVader;
        }
    }

    private static void imprimirTablero1() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // Recorre todas las filas del tablero1.
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) { // Recorre todas las columnas del tablero1.
                System.out.print(tablero1[i][j] + " "); // Imprime el contenido de la celda.
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
        System.out.println(""); // Salto de línea adicional para separar.
        System.out.println("");
        System.out.println("");
    }

    private static void imprimirTablero2() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // Recorre todas las filas del tablero2.
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) { // Recorre todas las columnas del tablero2.
                System.out.print(tablero2[i][j] + " "); // Imprime el contenido de la celda.
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
        System.out.println(""); // Salto de línea adicional para separar.
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        tablero1 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO]; // Inicializa tablero1.
        asignarLibresATablero1('L'); // Llena tablero1 con 'L'.
        tablero1[9][9] = 'F'; // Establece la meta ('F') en tablero1.
        asignarPersonajesATablero1('Y', 1); // Coloca a Yoda en tablero1.
        asignarPersonajesATablero1('D', 5); // Coloca 5 enemigos ('D') en tablero1.
        asignarPersonajesATablero1('M', 5); // Coloca 5 muros ('M') en tablero1.
        asignarPersonajesATablero1('P', 5); // Coloca 5 pociones ('P') en tablero1.
        imprimirTablero1();

        tablero2 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO]; // Inicializa tablero2.
        asignarLibresATablero2('L'); // Llena tablero2 con 'L'.
        tablero2[9][9] = 'F'; // Establece la meta ('F') en tablero2.
        asignarPersonajesATablero2('V', 1); // Coloca a Vader en tablero2.
        asignarPersonajesATablero2('R', 5); // Coloca 5 enemigos ('R') en tablero2.
        asignarPersonajesATablero2('M', 5); // Coloca 5 muros ('M') en tablero2.
        asignarPersonajesATablero2('P', 5); // Coloca 5 pociones ('P') en tablero2.
        imprimirTablero2();

        

}