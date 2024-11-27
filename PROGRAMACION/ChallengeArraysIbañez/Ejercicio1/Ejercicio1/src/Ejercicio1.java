import java.util.Random;
public class Ejercicio1 {
    //array de 10 dimensiones con numeros random
        public static void main(String[] args) {
            int[] arrayNumeroAleatorio = new int[10];
            int x, i = 0;
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                arrayNumeroAleatorio[j] = random.nextInt(100) + 1;

                if (j == 0)
                    System.out.print("Los números del array son: " + arrayNumeroAleatorio[j] + ", ");
                if (j < 10)
                    System.out.print(arrayNumeroAleatorio[j] + ", ");
                if (j == 9)
                    System.out.print(arrayNumeroAleatorio[j] + ".");
            }
        }
    }