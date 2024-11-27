import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int totalHuevos = entrada.nextInt();
            int capacidadOlla = entrada.nextInt();

            if (totalHuevos == 0 && capacidadOlla == 0) {
                break;
            }

            int tiempoCoccion = obtenerTiempoCoccion(totalHuevos, capacidadOlla);
            System.out.println(tiempoCoccion);
        }
        entrada.close();
    }

    public static int obtenerTiempoCoccion(int cantidadHuevos, int capacidadMaxima) {
        int numeroTandas = (int) Math.ceil((double) cantidadHuevos / capacidadMaxima);

        return numeroTandas * 10;
    }
}
