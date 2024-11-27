import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] array = new char[10][10];
        String[] palabras = {"PALABRA", "ALBERTO", "PIRULETA"
        };

        inicializarArray(array);
        escribirPalabraAleatoria(array, palabras);
        escribirPalabraAleatoria(array, palabras);
        imprimirArray(array);
    }

    public static void inicializarArray(char[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) ('A' + random.nextInt(26));
            }
        }
    }
    public static void escribirPalabraAleatoria(char[][] array, String[] palabras) {
        Random random = new Random();
        String palabra = palabras[random.nextInt(palabras.length)];
        int longitud = palabra.length();

        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        boolean palabraEscrita = false;

        while (!palabraEscrita) {
            int inicioPalabraX = random.nextInt(10);
            int inicioPalabraY = random.nextInt(10);
            int direccion = random.nextInt(8);

            int finalX = inicioPalabraX + dx[direccion] * (longitud - 1);
            int finalY = inicioPalabraY + dy[direccion] * (longitud - 1);

            if (finalX >= 0 && finalX < 10 && finalY >= 0 && finalY < 10) {
                boolean espacioLibre = true;

                if (espacioLibre) {
                    for (int k = 0; k < longitud; k++) {
                        int x = inicioPalabraX + dx[direccion] * k;
                        int y = inicioPalabraY + dy[direccion] * k;
                        array[x][y] = palabra.charAt(k);
                    }
                    palabraEscrita = true;
                }
            }
        }
    }

    public static void imprimirArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}

