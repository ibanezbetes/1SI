import java.util.Random;
import java.util.Scanner;

public class BusquedaArrayAleatoriov3 {
    public static void main(String[] args) {

        // Inicializar variables
        int[] array = new int[100];
        boolean encontrado = false;
        int i = 0;
        Random random = new Random();
        System.out.println("Introduce un número para comprobarlo en el array: ");
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            array[i] = random.nextInt(10);
            i = i + 1;
        } while (i < 100);

        x = scanner.nextInt();

        // valdría un while o un for
        for (i = 0; i < 100; i++) {
            if (array[i] == x){
                System.out.println("Encontrado en la posición " + i + ".");
                encontrado = true;
            }
        }

        // Si no se encontró el número (por lo tanto el booleano "encontrado" es False) lo escribe por pantalla
        if (!encontrado) {
            System.out.println("No existe el número " + x + " en el array.");
        }
    }
}
