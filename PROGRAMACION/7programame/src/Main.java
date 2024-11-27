import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int numeroResidentes = entrada.nextInt();
            if (numeroResidentes == 0) break;

            int[] listaEdades = new int[numeroResidentes];
            for (int indice = 0; indice < numeroResidentes; indice++) {
                listaEdades[indice] = entrada.nextInt();
            }

            long desorganizacionTotal = contarDesequilibrios(listaEdades);

            System.out.println(desorganizacionTotal);
        }

        entrada.close();
    }

    public static long contarDesequilibrios(int[] edades) {
        int[] auxiliar = new int[edades.length];
        return mezclaYCuenta(edades, auxiliar, 0, edades.length - 1);
    }

    private static long mezclaYCuenta(int[] edades, int[] auxiliar, int inicio, int fin) {
        long totalCuenta = 0;
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;

            totalCuenta += mezclaYCuenta(edades, auxiliar, inicio, mitad);

            totalCuenta += mezclaYCuenta(edades, auxiliar, mitad + 1, fin);

            totalCuenta += fusionYCuenta(edades, auxiliar, inicio, mitad, fin);
        }
        return totalCuenta;
    }

    private static long fusionYCuenta(int[] edades, int[] auxiliar, int inicio, int mitad, int fin) {
        int i = inicio;
        int j = mitad + 1;
        int k = inicio;
        long cuentaDesequilibrios = 0;

        while (i <= mitad && j <= fin) {
            if (edades[i] <= edades[j]) {
                auxiliar[k++] = edades[i++];
            } else {
                auxiliar[k++] = edades[j++];
                cuentaDesequilibrios += (mitad + 1) - i;
            }
        }

        while (i <= mitad) {
            auxiliar[k++] = edades[i++];
        }

        while (j <= fin) {
            auxiliar[k++] = edades[j++];
        }

        for (i = inicio; i <= fin; i++) {
            edades[i] = auxiliar[i];
        }

        return cuentaDesequilibrios;
    }
}
