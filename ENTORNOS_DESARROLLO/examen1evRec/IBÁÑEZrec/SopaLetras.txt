import java.util.Random;

public class SopaLetras {
    static String[] palabras ={
            "HELADA",
            "MESA",
            "PATATA"
    };

    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static char[][] sopaLetras = new char[10][10];
    static char[][] sopaLetrasCopia = new char[10][10];
    static Random ale = new Random();

    static void rellenarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numAle = ale.nextInt(26);
                sopaLetras[i][j] = letras[numAle];
            }
        }
    }

    static void rellenarMatrizCopia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopaLetrasCopia[i][j] = '0';
            }

        }
    }

    public static void imprimirMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizCopia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetrasCopia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rellenarMatriz();
        rellenarMatrizCopia();
        imprimirMatriz();
        System.out.println();
        imprimirMatrizCopia();
        System.out.println();

        for (int i = 0; i < palabras.length; i++) {
            int filaAl = 0;
            int colAl = 0;


            do {
                filaAl = ale.nextInt(10);
                colAl = ale.nextInt(10);
            } while (sopaLetrasCopia[filaAl][colAl] != '0');


            if (colAl + palabras[i].length() > 10) {
                i--;
            } else {
                boolean isLibre = true;
                int max = colAl + palabras[i].length();
                for (int z = colAl; z < max; z++) {
                    if (sopaLetrasCopia[filaAl][z] != '0') {
                        isLibre = false;
                        break;
                    }
                }

                if (isLibre) {
                    int contador = 0;
                    for (int z = colAl; z < max; z++) {
                        sopaLetras[filaAl][z] = palabras[i].charAt(contador);
                        sopaLetrasCopia[filaAl][z] = palabras[i].charAt(contador);
                        contador++;
                    }
                }
            }
        }

        imprimirMatrizCopia();
        System.out.println();
        imprimirMatriz();
    }
}