import java.util.Random;
import java.util.Scanner;
//Daniel Jesús Ibáñez Betés
public class Main {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;
    private static int filaBart;
    private static int columnaBart;

    public static void asignarLibreACasillasLibres(char caracter){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j]= caracter;
                //para rellenar la matriz con 'caracter' que será 'L'
            }
        }
    }

    public static void asignarPersonajeACasillaLibre(char caracter, int numRepeticiones){
        Random aleatorio = new Random();
        int filaAleatorio = -1;
        int columnaAleatorio = -1;
        for (int i = 0; i < numRepeticiones; i++) {
            //indicaremos un numero de repeticiones que tiene que rellenar con ese caracter (dependiendo del caracter será un numero de repeticiones u otro)
            do {
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
                //hacemos una varible de valor aleatoria para FILA y para COLUMNA (para poder asignar caracteres de forma random)
                //esto lo hará mientras la casilla a randomizar sea 'L'
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            }while (tablero[filaAleatorio][columnaAleatorio]!='L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
        if (caracter=='B'){
            filaBart = filaAleatorio;
            columnaBart = columnaAleatorio;
        }
    }

    public static void imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            //hacemos un for, para imprimir toda la fila con columna 0
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //cuando se ha impreso toda la fila, pasamos a la siguiente columna y asi hasta imprimir la matriz
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarLibreACasillasLibres('L');
        //rellenamos toda la matriz con "L" indicando que son casillas libres
        //imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
        //hemos asignado la letra F como "meta" (objetivo) del juego, en la ultima casilla abajo la derecha
        asignarPersonajeACasillaLibre('B', 1);
        //hemos asignado la letra 'B' de manera random siempre y cuando fuera casilla libre, 'numRepeticiones' de veces, en este caso 1
        asignarPersonajeACasillaLibre('M', 10);
        //asignamos M, 10 veces de la misma manera que B
        asignarPersonajeACasillaLibre('H', 10);
        imprimirTablero();
        Scanner lector = new Scanner(System.in);
        //leemos por pantalla
        int vidas = 3;
        do {
            System.out.println("Introduce el movimiento (WASD): ");
            String desplazamiento = lector.nextLine(); //(no me acordaba de esta linea)
            switch (desplazamiento) {
                case "A":
                    if((columnaBart - 1) >= 0){
                        columnaBart = columnaBart - 1; //límite del tablero
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart+1] = 'L';
                                System.out.println("Has perdido una vida. Te quedan " + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart+1] = 'L';
                                break;
                            case 'M':
                                System.out.println("Hay un muro. No puedes avanzar por ahí.");
                                columnaBart = columnaBart + 1;
                                break;
                            default:
                        }
                    }else  {
                        System.out.println("No se puede ir a la izquierda.");
                    }
                    break;
                case "S":
                    if((filaBart + 1) <= 9){
                        filaBart = filaBart + 1; //límite del tablero
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart-1][columnaBart] = 'L';
                                System.out.println("Has perdido una vida. Te quedan " + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart-1][columnaBart] = 'L';
                                break;
                            case 'M':
                                System.out.println("Hay un muro. No puedes avanzar por ahí.");
                                filaBart = filaBart - 1;
                                break;
                            default:
                        }
                    }else  {
                        System.out.println("No se puede ir abajo.");
                    }
                    break;
                case "D":
                    if((columnaBart + 1) <= 9){
                        columnaBart = columnaBart + 1; //límite del tablero
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart-1] = 'L';
                                System.out.println("Has perdido una vida. Te quedan " + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart-1] = 'L';
                                break;
                            case 'M':
                                System.out.println("Hay un muro. No puedes avanzar por ahí.");
                                columnaBart = columnaBart - 1;
                                break;

                            default:
                        }
                    }else  {
                        System.out.println("No se puede ir a la derecha.");
                    }
                    break;
                case "W":
                    if((filaBart - 1) >= 0){
                        filaBart = filaBart - 1; //límite del tablero
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart+1][columnaBart] = 'L';
                                System.out.println("Has perdido una vida. Te quedan " + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart+1][columnaBart] = 'L';
                                break;
                            case 'M':
                                System.out.println("Hay un muro. No puedes avanzar por ahí.");
                                filaBart = filaBart + 1;
                                break;
                            default:
                        }
                    }else  {
                        System.out.println("No se puede ir arriba.");
                    }
                    break;
                default:
                    break;
            }
            imprimirTablero();
        } while  (vidas > 0 && tablero[filaBart][columnaBart] != 'F');
        if (vidas <= 0) {
            System.out.println("GAME OVER");
        } else if (tablero[filaBart][columnaBart] == 'F') {
            System.out.println("¡Has llegado a la meta! ¡Felicitaciones!");
        }
    }
}