import java.util.Scanner;
import java.util.Random;

public class Main {
    public static final int MAX_FILA_TABLERO = 10;
    public static final int MAX_COLUMNA_TABLERO = 10;
    public static char[][] tablero1;
    public static char[][] tablero2;
    public static int filaYoda;
    public static int columnaYoda;
    public static int filaVader;
    public static int columnaVader;
    public static int vidasYoda = 3;
    public static int vidasVader = 3;

    public static void asignarATablero1(char c
                                        aracter) {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero1[i][j] = caracter;
            }
        }
    }

    public static void asignarATablero2(char caracter) {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero2[i][j] = caracter;
            }
        }
    }

    public static void asignarPersaonajesATablero1(char caracter, int numeroRepeticiones) {
        Random aleatorio = new Random();
        int filaAleatoriaYoda = 0;
        int columnaAleatoriaYoda = 0;
        for (int i = 0; i < numeroRepeticiones; i++) {
            do {
                filaAleatoriaYoda = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatoriaYoda = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero1[filaAleatoriaYoda][columnaAleatoriaYoda] != '·');
            tablero1[filaAleatoriaYoda][columnaAleatoriaYoda] = caracter;
        }
        if (caracter == 'Y') {
            filaYoda = filaAleatoriaYoda;
            columnaYoda = columnaAleatoriaYoda;

        }
    }

    public static void asignarPersaonajesATablero2(char caracter, int numeroRepeticiones) {
        Random aleatorio = new Random();
        int filaAleatoriaVader = 0;
        int columnaAleatoriaVader = 0;
        for (int i = 0; i < numeroRepeticiones; i++) {
            do {
                filaAleatoriaVader = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatoriaVader = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero2[filaAleatoriaVader][columnaAleatoriaVader] != '·');
            tablero2[filaAleatoriaVader][columnaAleatoriaVader] = caracter;
        }
        if (caracter == 'V') {
            filaAleatoriaVader = filaVader;
            columnaAleatoriaVader = columnaVader;
        }
    }

    public static void imprimirTablero1() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void imprimirTablero2() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }


    public static void main(String[] args) {
        Random aleatorio = new Random();
        tablero1 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarATablero1('·');
        tablero1[9][9] = 'F';
        asignarPersaonajesATablero1('Y', 1);
        asignarPersaonajesATablero1('D', 5);
        asignarPersaonajesATablero1('M', 5);
        asignarPersaonajesATablero1('P', 5);
        imprimirTablero1();

        tablero2 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarATablero2('·');
        tablero2[9][9] = 'F';
        asignarPersaonajesATablero2('V', 1);
        asignarPersaonajesATablero2('R', 5);
        asignarPersaonajesATablero2('M', 5);
        asignarPersaonajesATablero2('P', 5);
        imprimirTablero2();

        Scanner lector = new Scanner(System.in);
        char posicionActual;
        int filaAnterior;
        int columnaAnterior;
        int fila;
        int columna;
        while (vidasYoda > 0 && vidasVader > 0) {
            imprimirTablero1();
            String inputYoda = lector.nextLine().toUpperCase();
            fila = filaYoda;
            columna = columnaYoda;
            columnaAnterior = columna;
            filaAnterior = fila;
            char movimiento = inputYoda.charAt(0);
            switch (movimiento) {
                case 'A':
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'D':
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                case 'W':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    break;
                case 'S':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    break;
                case 'Q':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'E':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                case 'Z':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'C':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    return;
            }
            posicionActual = tablero1[fila][columna];
            if (posicionActual == 'D') {
                vidasYoda--;
                System.out.println("Yoda ha perdido una vida. Le quedan " + vidasYoda + " vidas.");
            } else if (posicionActual == 'M') {
                System.out.println("Hay un muro. No puedes avanzar.");
                continue;
            } else if (posicionActual == 'P') {
                tablero1[fila][columna] = '·';
                do {
                    fila = aleatorio.nextInt(MAX_FILA_TABLERO);
                    columna = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
                } while (tablero1[fila][columna] != '·');
            } else if (posicionActual == 'F') {
                System.out.println("Yoda ha llegado a la meta! ¡HAS GANADO!");
                System.exit(0);
            }
            int nuevaFila;
            int nuevaColumna;
            tablero1[filaAnterior][columnaAnterior] = '·';
            tablero1[fila][columna] = 'Y';
            filaYoda = fila;
            columnaYoda = columna;
            if (vidasYoda <= 0) {
                System.out.println("Yoda ha perdido todas las vidas. GAME OVER.");
            } else if (vidasVader <= 0) {
                System.out.println("Vader ha perdido todas las vidas. GAME OVER.");
            }
            imprimirTablero2();
            String inputVader = lector.nextLine().toUpperCase();

            fila = filaVader;
            columna = columnaVader;

            columnaAnterior = columna;
            filaAnterior = fila;

            movimiento = inputVader.charAt(0);
            switch (movimiento) {
                case 'A':
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'D':
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                case 'W':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    break;
                case 'S':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    break;
                case 'Q':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'E':
                    fila = (fila - 1 + MAX_FILA_TABLERO) % MAX_FILA_TABLERO;
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                case 'Z':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    columna = (columna - 1 + MAX_COLUMNA_TABLERO) % MAX_COLUMNA_TABLERO;
                    break;
                case 'C':
                    fila = (fila + 1) % MAX_FILA_TABLERO;
                    columna = (columna + 1) % MAX_COLUMNA_TABLERO;
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    return;
            }

            posicionActual = tablero2[fila][columna];

            if (posicionActual == 'R') {
                vidasVader--;
                System.out.println("Vader ha perdido una vida. Le quedan " + vidasVader + " vidas.");
            } else if (posicionActual == 'M') {
                System.out.println("Hay un muro. No puedes avanzar.");
                continue;
            } else if (posicionActual == 'P') {
                tablero2[fila][columna] = '·';
                do {
                    fila = aleatorio.nextInt(MAX_FILA_TABLERO);
                    columna = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
                } while (tablero2[fila][columna] != '·');
            } else if (posicionActual == 'F') {
                System.out.println("Vader ha llegado a la meta! ¡HAS GANADO!");
                System.exit(0);
            }

            tablero2[filaAnterior][columnaAnterior] = '·';
            tablero2[fila][columna] = 'V';
            filaVader = fila;
            columnaVader = columna;



            if (vidasYoda <= 0) {
                System.out.println("Yoda ha perdido todas las vidas. GAME OVER.");
            } else if (vidasVader <= 0) {
                System.out.println("Vader ha perdido todas las vidas. GAME OVER.");
            }


        }
    }
}