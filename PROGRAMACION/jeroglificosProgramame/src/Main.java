import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero < 1 || numero > 9999999) {
                continue;
            }
            String resultado = "";
            int millones = numero / 1000000;
            numero %= 1000000;
            int centenasMil = numero / 100000;
            numero %= 100000;
            int decenasMil = numero / 10000;
            numero %= 10000;
            int miles = numero / 1000;
            numero %= 1000;
            int centenas = numero / 100;
            numero %= 100;
            int decenas = numero / 10;
            numero %= 10;
            int unidades = numero;

            for (int i = 0; i < millones; i++) resultado += "H";
            for (int i = 0; i < centenasMil; i++) resultado += "R";
            for (int i = 0; i < decenasMil; i++) resultado += "D";
            for (int i = 0; i < miles; i++) resultado += "F";
            for (int i = 0; i < centenas; i++) resultado += "C";
            for (int i = 0; i < decenas; i++) resultado += "G";
            for (int i = 0; i < unidades; i++) resultado += "T";

            System.out.println(resultado);
        }

        scanner.close();
    }
}
