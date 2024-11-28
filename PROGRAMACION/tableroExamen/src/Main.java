import java.util.Scanner;
import java.util.Random;
public class Main {
    public static final int MAX_FILA = 10;
    public static final int MAX_COLUMNA = 10;
    public static char[][] tablero1;
    public static char[][] tablero2;
    public static int filaYoda;
    public static int columnaYoda;
    public static int filaVader;
    public static int columnaVader;
    public static int vidasYoda = 10;
    public static int vidasVader = 10;
    public static int poderEspecialYoda = 1;

    public static int poderEspecialVader = 1;

    public static void asignarATablero1(char caracter) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero1[i][j] = caracter;
            }
        }
    }

    public static void asignarATablero2(char caracter) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero2[i][j] = caracter;
            }
        }
    }

    public static void asignarPersonajesATablero1(char caracter, int numeroRepeticiones) {
        Random aleatorio = new Random();
        int filaAleatoriaYoda = 0;
        int columnaAleatoriaYoda = 0;
        for (int i = 0; i < numeroRepeticiones; i++) {
            do {
                filaAleatoriaYoda = aleatorio.nextInt(MAX_FILA);
                columnaAleatoriaYoda = aleatorio.nextInt(MAX_COLUMNA);
            } while (tablero1[filaAleatoriaYoda][columnaAleatoriaYoda] != 'L');
            tablero1[filaAleatoriaYoda][columnaAleatoriaYoda] = caracter;
        }
        if (caracter == 'Y') {
            filaYoda = filaAleatoriaYoda;
            columnaYoda = columnaAleatoriaYoda;

        }
    }

    public static void asignarPersonajesATablero2(char caracter, int numeroRepeticiones) {
        Random aleatorio = new Random();
        int filaAleatoriaVader = 0;
        int columnaAleatoriaVader = 0;
        for (int i = 0; i < numeroRepeticiones; i++) {
            do {
                filaAleatoriaVader = aleatorio.nextInt(MAX_FILA);
                columnaAleatoriaVader = aleatorio.nextInt(MAX_COLUMNA);
            } while (tablero2[filaAleatoriaVader][columnaAleatoriaVader] != 'L');
            tablero2[filaAleatoriaVader][columnaAleatoriaVader] = caracter;
        }
        if (caracter == 'V') {
            filaVader = filaAleatoriaVader;
            columnaVader = columnaAleatoriaVader;

        }
    }

    public static void imprimirTablero1() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero1[i][j] == 'T') {
                    System.out.print('L' + " ");
                    continue;
                }
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void saltarTrampasTablero1() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero1[i][j] == 'T') tablero1[i][j] = 'J';
            }
        }
        asignarPersonajesATablero1('T', 5);
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero1[i][j] == 'J') tablero1[i][j] = 'L';
            }
        }
    }

    public static void imprimirTablero2() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero2[i][j] == 'T') {
                    System.out.print('L' + " ");
                    continue;
                }
                System.out.print(tablero2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void saltarTrampasTablero2() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero2[i][j] == 'T') tablero2[i][j] = 'J';
            }
        }
        asignarPersonajesATablero2('T', 5);
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero2[i][j] == 'J') tablero2[i][j] = 'L';
            }
        }
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        tablero1 = new char[MAX_FILA][MAX_COLUMNA];
        asignarATablero1('L');
        tablero1[9][9] = 'F';
        asignarPersonajesATablero1('Y', 1);
        asignarPersonajesATablero1('D', 5);
        asignarPersonajesATablero1('T', 5);
        imprimirTablero1();

        tablero2 = new char[MAX_FILA][MAX_COLUMNA];
        asignarATablero2('L');
        tablero2[9][9] = 'F';
        asignarPersonajesATablero2('V', 1);
        asignarPersonajesATablero2('R', 5);
        asignarPersonajesATablero2('T', 5);
        imprimirTablero2();

        Scanner lectorY = new Scanner(System.in);
        Scanner lectorV = new Scanner(System.in);

        char posicionActualY;
        int filaAnteriorY;
        int columnaAnteriorY;
        int filaY;
        int columnaY;

        char posicionActualV;
        int filaAnteriorV;
        int columnaAnteriorV;
        int filaV;
        int columnaV;
        while (vidasYoda > 0 && vidasVader > 0) {
            imprimirTablero1();
            String inputYoda = lectorY.nextLine().toUpperCase();

            filaY = filaYoda;
            columnaY = columnaYoda;

            columnaAnteriorY = columnaY;
            filaAnteriorY = filaY;



            String movimientoY = inputYoda;
            switch (movimientoY) {
                case "A":
                    columnaY = (columnaY - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2A":
                    columnaY = (columnaY - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3A":
                    columnaY = (columnaY - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "D":
                    columnaY = (columnaY + 1) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2D":
                    columnaY = (columnaY + 2) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3D":
                    columnaY = (columnaY + 3) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "W":
                    filaY = (filaY - 1 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "2W":
                    filaY = (filaY - 2 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "3W":
                    filaY = (filaY - 3 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "S":
                    filaY = (filaY + 1) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "2S":
                    filaY = (filaY + 2) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "3S":
                    filaY = (filaY + 3) % MAX_FILA;
                    saltarTrampasTablero1();
                    break;
                case "Q":
                    filaY = (filaY - 1 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2Q":
                    filaY = (filaY - 2 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3Q":
                    filaY = (filaY - 3 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "E":
                    filaY = (filaY - 1 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY + 1) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2E":
                    filaY = (filaY - 2 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY + 2) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3E":
                    filaY = (filaY - 3 + MAX_FILA) % MAX_FILA;
                    columnaY = (columnaY + 3) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "Z":
                    filaY = (filaY + 1) % MAX_FILA;
                    columnaY = (columnaY - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2Z":
                    filaY = (filaY + 2) % MAX_FILA;
                    columnaY = (columnaY - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3Z":
                    filaY = (filaY + 3) % MAX_FILA;
                    columnaY = (columnaY - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "C":
                    filaY = (filaY + 1) % MAX_FILA;
                    columnaY = (columnaY + 1) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "2C":
                    filaY = (filaY + 2) % MAX_FILA;
                    columnaY = (columnaY + 2) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "3C":
                    filaY = (filaY + 3) % MAX_FILA;
                    columnaY = (columnaY + 3) % MAX_COLUMNA;
                    saltarTrampasTablero1();
                    break;
                case "P":
                    if (poderEspecialYoda >= 1) {
                        tablero1[filaY][columnaY] = 'L';
                        do {
                            filaY = aleatorio.nextInt(MAX_FILA);
                            columnaY = aleatorio.nextInt(MAX_COLUMNA);
                            poderEspecialYoda = 0;
                        } while (tablero1[filaY][columnaY] != 'L');

                    } else if (poderEspecialYoda < 1) {
                        System.out.print("Ya has usado el poder especial.");
                        System.out.println("");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Movimiento inválido.");
                    continue;
            }

            posicionActualY = tablero1[filaY][columnaY];

            if (posicionActualY == 'D') {
                vidasYoda--;
                System.out.println("Yoda ha perdido una vida. Le quedan " + vidasYoda + ".");
            } else if (posicionActualY == 'T') {
                vidasYoda--;
                System.out.println("Yoda ha perdido una vida. Le quedan " + vidasYoda + ".");
                System.out.println("Hay una trampa. No puedes avanzar.");
                continue;
            } else if (posicionActualY == 'F') {
                System.out.println("Yoda ha llegado a la meta! ¡HAS GANADO!");
                System.exit(0);
            }

            /*int nuevaFila;
            int nuevaColumna;*/

            tablero1[filaAnteriorY][columnaAnteriorY] = 'L';
            tablero1[filaY][columnaY] = 'Y';
            filaYoda = filaY;
            columnaYoda = columnaY;

            if (vidasYoda <= 0) {
                System.out.println("Yoda ha perdido todas las vidas. GAME OVER.");
            } else if (vidasVader <= 0) {
                System.out.println("Vader ha perdido todas las vidas. GAME OVER.");
            }




            imprimirTablero2();
            String inputVader = lectorV.nextLine().toUpperCase();

            filaV = filaVader;
            columnaV = columnaVader;

            columnaAnteriorV = columnaV;
            filaAnteriorV = filaV;



            String movimientoV = inputVader;
            switch (movimientoV) {
                case "A":
                    columnaV = (columnaV - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2A":
                    columnaV = (columnaV - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3A":
                    columnaY = (columnaY - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "D":
                    columnaV = (columnaV + 1) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2D":
                    columnaV = (columnaV + 2) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3D":
                    columnaV = (columnaV + 3) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "W":
                    filaV = (filaV - 1 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "2W":
                    filaV = (filaV - 2 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "3W":
                    filaV = (filaV - 3 + MAX_FILA) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "S":
                    filaV = (filaV + 1) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "2S":
                    filaV = (filaV + 2) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "3S":
                    filaV = (filaV + 3) % MAX_FILA;
                    saltarTrampasTablero2();
                    break;
                case "Q":
                    filaV = (filaV - 1 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2Q":
                    filaV = (filaV - 2 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3Q":
                    filaV = (filaV - 3 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "E":
                    filaV = (filaV - 1 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV + 1) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2E":
                    filaV = (filaV - 2 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV + 2) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3E":
                    filaV = (filaV - 3 + MAX_FILA) % MAX_FILA;
                    columnaV = (columnaV + 3) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "Z":
                    filaV = (filaV + 1) % MAX_FILA;
                    columnaV = (columnaV - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2Z":
                    filaV = (filaV + 2) % MAX_FILA;
                    columnaV = (columnaV - 2 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3Z":
                    filaV = (filaV + 3) % MAX_FILA;
                    columnaV = (columnaV - 3 + MAX_COLUMNA) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "C":
                    filaV = (filaV + 1) % MAX_FILA;
                    columnaV = (columnaV + 1) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "2C":
                    filaV = (filaV + 2) % MAX_FILA;
                    columnaV = (columnaV + 2) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "3C":
                    filaV = (filaV + 3) % MAX_FILA;
                    columnaV = (columnaV + 3) % MAX_COLUMNA;
                    saltarTrampasTablero2();
                    break;
                case "P":
                    if (poderEspecialVader >= 1) {
                        tablero2[filaV][columnaV] = 'L';
                        do {
                            filaV = aleatorio.nextInt(MAX_FILA);
                            columnaV = aleatorio.nextInt(MAX_COLUMNA);
                            poderEspecialVader = 0;
                        } while (tablero2[filaV][columnaV] != 'L');

                    } else if (poderEspecialVader < 1) {
                        System.out.print("Ya has usado el poder especial.");
                        System.out.println("");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Movimiento inválido.");
                    continue;
            }

            posicionActualV = tablero2[filaV][columnaV];

            if (posicionActualV == 'R') {
                vidasVader--;
                System.out.println("Vader ha perdido una vida. Le quedan " + vidasVader + ".");
            } else if (posicionActualV == 'T') {
                vidasVader--;
                System.out.println("Vader ha perdido una vida. Le quedan " + vidasVader + ".");
                System.out.println("Hay una trampa. No puedes avanzar.");
                continue;
            } else if (posicionActualV == 'F') {
                System.out.println("Vader ha llegado a la meta! ¡HAS GANADO!");
                System.exit(0);
            }

            /*int nuevaFila;
            int nuevaColumna;*/

            tablero2[filaAnteriorV][columnaAnteriorV] = 'L';
            tablero2[filaV][columnaV] = 'V';
            filaVader = filaV;
            columnaVader = columnaV;

            if (vidasYoda <= 0) {
                System.out.println("Yoda ha perdido todas las vidas. GAME OVER.");
            } else if (vidasVader <= 0) {
                System.out.println("Vader ha perdido todas las vidas. GAME OVER.");
            }

        }
    }
}