import java.util.Random;
import java.util.Scanner;

public class TableroSimpsonFuncional {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;
    public static char[][] ejesCoordenadasMovimiento;
    private static int filaBart;
    private static int columnaBart;

<<<<<<< Updated upstream
   /* private static void setEjesCoordenadasMovimiento(){
=======
    /*private static void setEjesCoordenadasMovimiento(){
>>>>>>> Stashed changes
        ejesCoordenadasMovimiento[0][0] == 0;
        ejesCoordenadasMovimiento[0][1] == 0;
        ejesCoordenadasMovimiento[0][2] == 1;
        ejesCoordenadasMovimiento[0][3] == -1;
        ejesCoordenadasMovimiento[0][4] == 1;
        ejesCoordenadasMovimiento[1][0] == 1;
        ejesCoordenadasMovimiento[1][1] == -1;
        ejesCoordenadasMovimiento[1][2] == 0;
        ejesCoordenadasMovimiento[1][3] == 0;
        ejesCoordenadasMovimiento[1][4] == 1;

<<<<<<< Updated upstream
    }
*/
=======
    }*/

>>>>>>> Stashed changes
    private static void imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0][0], [0][1],[0][2], ETC...
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
            System.out.println("");
            System.out.println("");
            System.out.println("");
}

    private static void asignarLibreACasillasLibres(char caracter){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
            //[0][0], [0][1], [0][2], ETC...
            tablero[i][j] = caracter;
        }
    }
    }

    private static void asignarPersonajesACasillasLibres(char caracter, int numRepeticiones){
    //4º ASIGNAR A BART
    Random aleatorio = new Random();
        int filaAleatorio = -1;
        int columnaAleatorio = -1;
        for (int i = 0; i < numRepeticiones; i++) {
            do { //esto lo hace mientras la casilla sea diferente a L
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO); //De 0 a N-1
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO); //De 0 a N-1
            }while (tablero[filaAleatorio][columnaAleatorio]!='L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
        if(caracter=='B'){
            filaBart = filaAleatorio;
            columnaBart = columnaAleatorio;
        }
    }

    
    public static void main(String[] args) {
        //1º inicializo matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarLibreACasillasLibres('L');
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
        asignarPersonajesACasillasLibres('B', 1);
        imprimirTablero();
        asignarPersonajesACasillasLibres('H', 10);
        imprimirTablero();
        asignarPersonajesACasillasLibres('M', 10);
        imprimirTablero();

        // Desplazamiento de Bart
        // A - IZQUIERDA
        // D - DERECHA
        // W - ARRIBA
        // S - ABAJO
    Scanner lector = new Scanner(System.in);
    int vidas = 3;    
    do {
        System.out.println("JUGAR");
        System.out.println("Introduce el desplazamiento");
        System.out.println("A - IZQUIERDA, D - DERECHA, W - ARRIBA, S - ABAJO");
        String desplazamiento = lector.nextLine();
        System.out.println("Desplazamiento=" + desplazamiento);
        //
        // para hacer un proceso límites de tablero
        // private static boolean siFueraTablero(int x[fila], int y[columna]) {
        // if(filaBart<0 || filaBart>9 || columnaBart<0 || filaBart>9){
        // return true;
        // } else return false;
        //
        // debajo de cada case:
        // if(siFueraTablero()){
        // }
        //
    switch (desplazamiento) {
        case "A":
            // A - IZQUIERDA
            if((columnaBart - 1) >= 0){
                columnaBart = columnaBart - 1; //YA ESTÁ EN LA CASILLA MINIMA DEL TABLERO, SE SALDRÍA DEL ARRAY
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
            // S - ABAJO 
            if((filaBart + 1) <= 9){
                filaBart = filaBart + 1; //YA ESTÁ EN LA CASILLA MINIMA DEL TABLERO, SE SALDRÍA DEL ARRAY
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
            // D - DERECHA
            if((columnaBart + 1) <= 9){
                columnaBart = columnaBart + 1; //YA ESTÁ EN LA CASILLA MINIMA DEL TABLERO, SE SALDRÍA DEL ARRAY
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
            // W - ARRIBA
            if((filaBart - 1) >= 0){
                filaBart = filaBart - 1; //YA ESTÁ EN LA CASILLA MINIMA DEL TABLERO, SE SALDRÍA DEL ARRAY
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
    } while (vidas > 0 && tablero[filaBart][columnaBart] != 'F');
        if (vidas <= 0) {
            System.out.println("Has perdido todas las vidas. GAME OVER.");
        } else if (tablero[filaBart][columnaBart] == 'F') {
            System.out.println("¡Has llegado a la meta! ¡Felicitaciones!");
        }
}
}