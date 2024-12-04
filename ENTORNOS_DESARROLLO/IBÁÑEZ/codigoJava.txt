import java.util.Random;

class SopaLetras {
    static String palabras[] = { "HELADA", "MESA", "PATATA" }; //cuando es string se usan comillas dobles, no simples
    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static char sopaLetras[][] = new char[10][10];
    static char sopaLetrasCopia[][] = new char[10][10];
    static Random ale = new Random();

    static void rellenarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numAle = ale.nextInt(26);
                sopaLetras[j][i] = letras[numAle];
            }
        }
    }
        //los índices iban hasta 10, lo cual era outOfIndex, tiene que eir de 0 a 9 (tanto en rellenarMatriz como en rellenarMatrizCopia)
    static void rellenarMatrizCopia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopaLetrasCopia[j][i] = '0'; //aqui hay que usar comilals simples para asignar
            }
        }
    }

    public static void imprimirMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetras[j][i] + " "); //aqui comillas dobles para concatenar cadena
            }
            System.out.println("");
        }
    }

    public static void imprimirMatrizCopia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetrasCopia[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        rellenarMatriz();
        rellenarMatrizCopia();
        imprimirMatriz();
        System.out.println();
        imprimirMatrizCopia();
        System.out.println("");

        for (int i = 0; i < palabras.length; i++) {
            int filaAl, colAl;

            do {
                filaAl = ale.nextInt(10);
                colAl = ale.nextInt(10);
            } while (sopaLetrasCopia[filaAl][colAl] != '0');

            if (colAl + (palabras[i].length() - 1) > 9) {
                i--;
            } else {
                boolean isLibre = true;
                int max = colAl + (palabras[i].length() - 1); //es .length (no _length)
                for (int z = colAl; z <= max; z++) {
                    if (sopaLetrasCopia[filaAl][z] != '0') {
                        isLibre = false;
                        break;
                    }
                }

                if (isLibre) { // is isLibre
                    int contador = 0;
                    for (int z = colAl; z <= max; z++) {
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
