import java.util.Scanner;

// Clase principal que realiza el procesamiento de texto para contar vocales y detectar "FIN"
public class Main {
    // Declaración de un objeto Scanner para leer la entrada del usuario
    static Scanner entrada = new Scanner(System.in);

    // Método que traduce un carácter dado un desplazamiento (utilizado para cifrado/decifrado)
    private static char traducirCaracter(char caracter, int desplazamiento) {
        // Si el carácter es una letra minúscula, aplica el desplazamiento con límites
        if (('a' <= caracter) && (caracter <= 'z')) {
            char nuevoCaracter = (char) (caracter + desplazamiento);
            // Ajusta si el desplazamiento lleva fuera del rango 'a' - 'z'
            if (nuevoCaracter > 'z') nuevoCaracter -= 26;
            if (nuevoCaracter < 'a') nuevoCaracter += 26;
            return nuevoCaracter;
        }
        // Si el carácter es una letra mayúscula, aplica el mismo desplazamiento
        if (('A' <= caracter) && (caracter <= 'Z')) {
            char nuevoCaracter = (char) (caracter + desplazamiento);
            // Ajusta si el desplazamiento lleva fuera del rango 'A' - 'Z'
            if (nuevoCaracter > 'Z') nuevoCaracter -= 26;
            if (nuevoCaracter < 'A') nuevoCaracter += 26;
            return nuevoCaracter;
        }
        // Si el carácter no es letra, lo devuelve sin cambios
        return caracter;
    }

    // Método para determinar si un carácter es una vocal (tanto en mayúsculas como en minúsculas)
    private static boolean esVocal(char caracter) {
        // Verifica si el carácter es una vocal específica y no un número par (condición del enunciado)
        if (caracter % 2 != 0) {
            switch (caracter) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                    return true; // Retorna true si es vocal
            }
        }
        return false; // Retorna false si no es vocal
    }

    // Método principal que inicia la ejecución del programa
    public static void main(String[] args) {
        String texto; // Variable para almacenar cada línea de texto leída
        boolean finalizar = false; // Bandera para indicar cuándo finalizar el bucle
        boolean primeraLinea = true; // Indica si es la primera línea, para un salto de línea inicial

        // Bucle principal que procesa el texto línea por línea
        do {
            int contadorVocales = 0; // Contador para el número de vocales encontradas en la línea
            texto = entrada.nextLine(); // Lee una línea de texto del usuario

            // Imprime un salto de línea solo en la primera iteración para formateo de salida
            if (primeraLinea) {
                System.out.println();
            }
            primeraLinea = false; // Cambia el estado para evitar saltos de línea en la siguiente iteración

            // Calcula el desplazamiento en minúsculas entre el primer carácter y 'p'
            int desplazamiento = 'p' - Character.toLowerCase(texto.charAt(0));

            // Procesa cada carácter de la línea empezando desde el segundo
            for (int i = 1; i < texto.length(); i++) {
                // Aplica el desplazamiento al carácter actual para "traducirlo"
                char caracterTraducido = traducirCaracter(texto.charAt(i), desplazamiento);

                // Verifica si se ha formado la palabra "FIN" después de la traducción
                if (i >= 3) { // Requiere al menos tres caracteres anteriores para detectar "FIN"
                    if ((traducirCaracter(texto.charAt(i - 2), desplazamiento) == 'F') &&
                            (traducirCaracter(texto.charAt(i - 1), desplazamiento) == 'I') &&
                            (traducirCaracter(texto.charAt(i), desplazamiento) == 'N')) {
                        finalizar = true; // Cambia la bandera para salir del bucle
                        break; // Sale del bucle si se detecta "FIN"
                    }
                }

                // Si el carácter traducido es una vocal, incrementa el contador de vocales
                if (esVocal(caracterTraducido)) {
                    contadorVocales++;
                }
            }
            // Imprime el número total de vocales encontradas en la línea actual
            System.out.println(contadorVocales);

        } while (!finalizar); // Repite el bucle hasta que se detecte "FIN" en una línea de texto
        System.exit(0); // Termina el programa
    }
}
