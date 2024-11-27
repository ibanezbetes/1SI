import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int bloques = scanner.nextInt();
            if (bloques == 0) break;

            int altura = 0;
            int bloquesUsados = 0;
            int nivel = 1;

            while (bloquesUsados + (nivel * nivel) <= bloques) {
                bloquesUsados += (nivel * nivel);
                altura++;
                nivel++;
            }

            System.out.println(altura);
        }
    }
}
