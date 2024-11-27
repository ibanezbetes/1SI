import java.util.Arrays;

public class PracticaArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        rellenarArrayAscendente(array);
        mostrarArray(array, "Array en orden ascendente: ");

        mostrarArrayInverso(array);

        rellenarArrayPares(array);
        mostrarArray(array, "Array con números pares: ");

        mostrarElementosDeDosEnDos(array);

        rellenarArrayImpares(array);
        mostrarArray(array, "Array con números impares: ");

        duplicarElementos(array);
        mostrarArray(array, "Array con cada elemento duplicado: ");

        calcularSumaElementos(array);

        encontrarMaximoMinimo(array);
    }

    // Rellenar el array en orden ascendente (0, 1, 2, ..., 9)
    public static void rellenarArrayAscendente(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    // Mostrar el array
    public static void mostrarArray(int[] array, String mensaje) {
        System.out.println(mensaje + Arrays.toString(array));
    }

    // Mostrar el array en orden inverso
    public static void mostrarArrayInverso(int[] array) {
        System.out.print("Array en orden inverso: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Rellenar el array con números pares (0, 2, 4, ..., 18)
    public static void rellenarArrayPares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
    }

    // Mostrar elementos de dos en dos (primer y segundo, tercer y cuarto, etc.)
    public static void mostrarElementosDeDosEnDos(int[] array) {
        System.out.print("Elementos de dos en dos: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print("[" + array[i] + ", " + (i + 1 < array.length ? array[i + 1] : " ") + "] ");
        }
        System.out.println();
    }

    // Rellenar el array con números impares (1, 3, 5, ..., 19)
    public static void rellenarArrayImpares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
    }

    // Duplicar cada elemento del array
    public static void duplicarElementos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    // Calcular la suma de todos los elementos
    public static void calcularSumaElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de todos los elementos: " + suma);
    }

    // Encontrar el valor máximo y mínimo del array
    public static void encontrarMaximoMinimo(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}
