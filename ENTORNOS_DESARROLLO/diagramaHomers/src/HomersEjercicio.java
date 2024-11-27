import java.util.Scanner;
import java.util.Random;

public class HomersEjercicio {
    public static void main(String[] args) {
        int homers = 0;
        int homersrandom = 0;
        char[][] array = new char[4][4];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce el número de homers que quieres generar, debe ser menor que 17 (casillas totales del tablero).");
        homers = scanner.nextInt();

        while (homers > 16) {
            System.out.println("Error: El número de homers no puede ser mayor que 16.");
            homers = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = 'L';
            }
        }

        while (homersrandom < homers) {
            int i = random.nextInt(4);
            int j = random.nextInt(4);
            if (array[i][j] == 'L') {
                array[i][j] = 'H';
                homersrandom++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
