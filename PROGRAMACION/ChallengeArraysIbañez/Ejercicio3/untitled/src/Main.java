
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Me tengo que acordar de STATIC,
    // si lo quiero arriba
    // static String arrayPrimitiva[] = new String[6];


    public static void main(String[] args) {
        Random aleatorio = new Random();
        int aciertos = 0;
        Scanner leer = new Scanner(System.in);
        String arrayPrimitiva[] = new String[6];
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            int numAle = aleatorio.nextInt(100);
            // convertir un entero a cadena
            // (convertir de int a string)
            arrayPrimitiva[i] = String.valueOf(numAle) ;
        }

        System.out.println("Dame el número 1: ");
        String cadUsuario1 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario1.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
                aciertos = aciertos + 1;
            }
        }
        System.out.println("Dame el número 2: ");
        String cadUsuario2 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario2.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
                aciertos = aciertos + 1;
            }
        }
        System.out.println("Dame el número 3: ");
        String cadUsuario3 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario3.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
                aciertos = aciertos + 1;
            }
        }

        //imprimir array
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < arrayPrimitiva.length-1; i++) {
            System.out.print(arrayPrimitiva[i] + ", ");
        }
        System.out.print(arrayPrimitiva[arrayPrimitiva.length-1] + ".");
        System.out.println("");
        // fin imprimir array

        switch (aciertos){
            case 0:
                System.out.println(" ");
                System.out.println("Eres un paquetillo, no has acertado ni uno.");
                break;
            case 1:
                System.out.println(" ");
                System.out.println("Has acertado " + aciertos + ". Mejorable...");
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Has acertado " + aciertos + ". Está muy bien.");
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Has acertado " + aciertos + ". ERES ADIVINO!");
                break;
            default:
                if (aciertos > 3) {
                    System.out.println(" ");
                    System.out.println("Has acertado " + aciertos + ". ERES UN DIOS!");
                }else {}
                break;
        }
    }
}