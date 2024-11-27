import java.util.Random;

// Importa la clase Random para generar números aleatorios.

public class Main {
    static String palabras[] ={
            "HELADA",
            "MESA",
            "PATATA"
    };
    // Array de palabras que se insertarán en la sopa de letras.

    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    // Array de todas las letras del alfabeto, usadas para rellenar la sopa de letras aleatoriamente.

    static char sopaLetras[][] = new char[10][10];
    // Matriz principal que representará la sopa de letras.

    static char sopaLetrasCopia[][] = new char[10][10];
    // Matriz auxiliar que almacenará las posiciones ocupadas por palabras.

    static Random aleatorio = new Random();
    // Instancia de la clase Random para generar valores aleatorios.

    static void rellenarMatriz(){
        // Método que rellena la matriz sopaLetras con letras aleatorias.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numAle = aleatorio.nextInt(26);
                // Genera un número aleatorio entre 0 y 25.
                sopaLetras[i][j] = letras[numAle];
                // Asigna una letra aleatoria de 'letras' a la posición actual de la matriz.
            }
        }
    }

    static void rellenarMatrizCopia(){
        // Método que inicializa la matriz sopaLetrasCopia con el carácter '0' en todas sus posiciones.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopaLetrasCopia[i][j] = '0';
                // Marca todas las posiciones como libres usando el carácter '0'.
            }
        }
    }

    public static void imprimirMatriz(){
        // Método que imprime la matriz sopaLetras.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetras[i][j] + " ");
                // Imprime cada carácter de la matriz con un espacio.
            }
            System.out.println();
            // Salto de línea al final de cada fila.
        }
    }

    public static void imprimirMatrizCopia(){
        // Método que imprime la matriz sopaLetrasCopia.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetrasCopia[i][j] + " ");
                // Imprime cada carácter de la matriz auxiliar.
            }
            System.out.println();
            // Salto de línea al final de cada fila.
        }
    }

    public static void main(String[] args) {
        // Método principal del programa.
        rellenarMatriz();
        // Rellena sopaLetras con letras aleatorias.

        rellenarMatrizCopia();
        // Inicializa sopaLetrasCopia con '0'.

        imprimirMatriz();
        // Imprime la matriz inicial sopaLetras con letras aleatorias.

        System.out.println();
        imprimirMatrizCopia();
        // Imprime la matriz sopaLetrasCopia inicial.

        for (int i = 0; i < palabras.length; i++) {
            // Itera por cada palabra del array 'palabras'.
            int filaAleatorio = 0;
            int columnaAleatorio = 0;
            // Variables para almacenar coordenadas aleatorias.

            do {
                filaAleatorio = aleatorio.nextInt(10);
                columnaAleatorio = aleatorio.nextInt(10);
                // Genera coordenadas aleatorias dentro de los límites de la matriz.
            } while (sopaLetrasCopia[filaAleatorio][columnaAleatorio] != '0');
            // Repite hasta encontrar una posición libre en sopaLetrasCopia.

            if (columnaAleatorio + (palabras[i].length() - 1) >= 10) {
                // Verifica si la palabra excede los límites de la matriz horizontalmente.
                i--;
                // Retrocede el índice de palabras para reintentar con la misma palabra.
            } else {
                boolean isLibre = true;
                // Bandera para verificar si hay suficiente espacio libre.

                int max = columnaAleatorio + (palabras[i].length() - 1);
                // Calcula la última columna necesaria para insertar la palabra.

                for (int z = columnaAleatorio; z <= max; z++) {
                    // Itera por las columnas necesarias para insertar la palabra.
                    if (sopaLetrasCopia[filaAleatorio][z] != '0') {
                        // Verifica si alguna posición está ocupada.
                        isLibre = false;
                        break;
                        // Si está ocupada, marca como no libre y detiene el bucle.
                    }
                }

                if (isLibre) {
                    // Si hay suficiente espacio libre:
                    int contador = 0;
                    // Contador para recorrer los caracteres de la palabra.

                    for (int z = columnaAleatorio; z <= max; z++) {
                        // Itera nuevamente por las columnas necesarias.
                        sopaLetras[filaAleatorio][z] = palabras[i].charAt(contador);
                        // Inserta el carácter actual de la palabra en sopaLetras.

                        sopaLetrasCopia[filaAleatorio][z] = palabras[i].charAt(contador);
                        // Marca la posición como ocupada con el mismo carácter en sopaLetrasCopia.

                        contador++;
                        // Incrementa el contador para pasar al siguiente carácter de la palabra.
                    }
                }
            }
        }
        imprimirMatriz();
        // Imprime la matriz sopaLetras después de insertar las palabras.

        System.out.println();
        imprimirMatrizCopia();
        // Imprime la matriz sopaLetrasCopia mostrando las posiciones ocupadas.
    }
}
