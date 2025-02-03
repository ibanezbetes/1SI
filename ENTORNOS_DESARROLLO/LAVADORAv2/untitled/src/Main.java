import Lavadora.Lavadora;
import Lavadora.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lista global de prendas
    private static List<Prenda> prendasDisponibles = new ArrayList<>();

    // Array (o lista) de lavadoras
    private static Lavadora[] lavadoras = new Lavadora[3];

    private static Scanner sc = new Scanner(System.in);

    private static void inicializarDatos() {
        // Inicializamos las 3 lavadoras
        lavadoras[0] = new Lavadora(7, "Rápido");
        lavadoras[1] = new Lavadora(8, "Algodón");
        lavadoras[2] = new Lavadora(7, "Rápido");

        // Creamos 10 prendas por defecto
        prendasDisponibles.add(new Prenda("Camiseta Blanca", 0.2, 30));
        prendasDisponibles.add(new Prenda("Pantalón Vaquero", 0.7, 50));
        prendasDisponibles.add(new Prenda("Sudadera Negra", 0.6, 60));
        prendasDisponibles.add(new Prenda("Calcetines Deportivos", 0.1, 40));
        prendasDisponibles.add(new Prenda("Toalla de Baño", 0.5, 70));
        prendasDisponibles.add(new Prenda("Sábana Matrimonial", 1.0, 80));
        prendasDisponibles.add(new Prenda("Camiseta Color", 0.3, 20));
        prendasDisponibles.add(new Prenda("Pantalón Chándal", 0.5, 45));
        prendasDisponibles.add(new Prenda("Jersey Lana", 0.7, 55));
        prendasDisponibles.add(new Prenda("Manta Pequeña", 1.0, 75));

        System.out.println("Se han inicializado 3 lavadoras y 10 prendas por defecto.\n");
    }

    private static void mostrarMenu() {
        System.out.println("\n------ MENÚ PRINCIPAL ------");
        System.out.println("1. Ver prendas disponibles");
        System.out.println("2. Añadir nueva prenda");
        System.out.println("3. Modificar nivel de suciedad de una prenda");
        System.out.println("4. Operar con las lavadoras");
        System.out.println("5. Salir");
    }

    // --------------------- OPCIONES DEL MENÚ ---------------------
    /**
     * Muestra únicamente las prendas que sigan disponibles (disponible == true).
     */
    private static void mostrarPrendas() {
        System.out.println("\n--- LISTA DE PRENDAS DISPONIBLES ---");
        if (prendasDisponibles.isEmpty()) {
            System.out.println("No hay prendas en la lista.");
            return;
        }

        List<Prenda> prendasSoloDisponibles = new ArrayList<>();
        for (Prenda prenda : prendasDisponibles) {
            if (prenda.isDisponible()) {
                prendasSoloDisponibles.add(prenda);
            }
        }

        if (prendasSoloDisponibles.isEmpty()) {
            System.out.println("No hay prendas disponibles (todas están cargadas en lavadoras).");
            return;
        }

        int index = 1;
        for (Prenda prenda : prendasSoloDisponibles) {
            System.out.println(index + ". " + prenda);
            index++;
        }
    }

    private static void anadirPrenda() {
        System.out.println("\n--- AÑADIR PRENDA ---");
        System.out.print("Introduce el nombre de la prenda: ");
        String nombre = sc.nextLine();

        double peso = leerDouble("Introduce el peso (kg): ");
        int suciedad = leerEntero("Introduce el nivel de suciedad (0-100): ");

        Prenda nuevaPrenda = new Prenda(nombre, peso, suciedad);
        prendasDisponibles.add(nuevaPrenda);

        System.out.println("Prenda añadida correctamente: " + nuevaPrenda);
    }

    private static void modificarSuciedadPrenda() {
        // Primero mostramos todas las prendas (no solo las disponibles, si quieres cambiar la suciedad de una ya cargada, podrías)
        // Dependiendo de la lógica, podrías querer mostrar solo las disponibles, pero aquí dejaremos todas.
        System.out.println("\n--- LISTA COMPLETA DE PRENDAS ---");
        if (prendasDisponibles.isEmpty()) {
            System.out.println("No hay prendas en la lista.");
            return;
        }

        int idx = 1;
        for (Prenda p : prendasDisponibles) {
            System.out.println(idx + ". " + p);
            idx++;
        }

        int indice = leerEntero("Elige el número de la prenda a modificar: ");
        if (indice < 1 || indice > prendasDisponibles.size()) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        Prenda prendaSeleccionada = prendasDisponibles.get(indice - 1);
        int nuevoNivel = leerEntero("Introduce el nuevo nivel de suciedad (0-100): ");
        prendaSeleccionada.setNivelSuciedad(nuevoNivel);

        System.out.println("Nivel de suciedad actualizado: " + prendaSeleccionada);
    }

    private static void operarLavadoras() {
        System.out.println("\n--- MENÚ DE LAVADORAS ---");
        System.out.println("Tenemos " + lavadoras.length + " lavadoras.");
        int indice = leerEntero("Elige una lavadora (1-" + lavadoras.length + "): ");

        if (indice < 1 || indice > lavadoras.length) {
            System.out.println("Lavadora no válida.");
            return;
        }

        Lavadora lavadoraSeleccionada = lavadoras[indice - 1];
        menuLavadora(lavadoraSeleccionada);
    }

    private static void menuLavadora(Lavadora lavadora) {
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- OPERANDO LAVADORA ---");
            System.out.println("1. Encender lavadora");
            System.out.println("2. Abrir puerta");
            System.out.println("3. Cerrar puerta");
            System.out.println("4. Cargar prenda en lavadora");
            System.out.println("5. Ver prendas dentro de la lavadora");
            System.out.println("6. Retirar TODAS las prendas");
            System.out.println("7. Definir ciclo de lavado");
            System.out.println("8. Abrir compartimento detergente");
            System.out.println("9. Cargar detergente");
            System.out.println("10. Cerrar compartimento detergente");
            System.out.println("11. Iniciar ciclo");
            System.out.println("12. Correr temporizador (simular lavado)");
            System.out.println("13. Apagar lavadora");
            System.out.println("14. Volver al menú anterior");

            int opcion = leerEntero("Elige una opción: ");
            switch (opcion) {
                case 1:
                    lavadora.encenderLavadora();
                    break;
                case 2:
                    lavadora.abrirPuertaLavadora();
                    break;
                case 3:
                    lavadora.cerrarPuertaLavadora();
                    break;
                case 4:
                    cargarPrendaEnLavadora(lavadora);
                    break;
                case 5:
                    verPrendasEnLavadora(lavadora);
                    break;
                case 6:
                    lavadora.retirarTodasPrendas();
                    break;
                case 7:
                    definirCicloLavado(lavadora);
                    break;
                case 8:
                    lavadora.abrirCompartimentoDetergente();
                    break;
                case 9:
                    int cantidadDetergente = leerEntero("Cantidad de detergente a cargar: ");
                    lavadora.cargarDetergente(cantidadDetergente);
                    break;
                case 10:
                    lavadora.cerrarCompartimentoDetergente();
                    break;
                case 11:
                    lavadora.iniciarCiclo();
                    break;
                case 12:
                    lavadora.establecerTemporizador();
                    break;
                case 13:
                    lavadora.apagarLavadora();
                    break;
                case 14:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    // --------------------- MÉTODOS AUXILIARES PARA MENÚ LAVADORA ---------------------
    /**
     * Muestra solo las prendas disponibles, permite elegir una
     * y la carga en la lavadora. Si se carga con éxito, se marca como no disponible.
     */
    private static void cargarPrendaEnLavadora(Lavadora lavadora) {
        // Construimos la lista con las prendas que siguen disponibles.
        List<Prenda> prendasSoloDisponibles = new ArrayList<>();
        for (Prenda p : prendasDisponibles) {
            if (p.isDisponible()) {
                prendasSoloDisponibles.add(p);
            }
        }

        if (prendasSoloDisponibles.isEmpty()) {
            System.out.println("No hay prendas disponibles para cargar.");
            return;
        }

        // Mostramos solamente las disponibles
        System.out.println("\n--- PRENDAS DISPONIBLES PARA CARGAR ---");
        int index = 1;
        for (Prenda p : prendasSoloDisponibles) {
            System.out.println(index + ". " + p);
            index++;
        }

        int indice = leerEntero("Elige el número de la prenda a cargar: ");
        if (indice < 1 || indice > prendasSoloDisponibles.size()) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        Prenda prendaElegida = prendasSoloDisponibles.get(indice - 1);

        // Comprobamos cuántas prendas había antes de intentar cargar
        int tamAnterior = lavadora.getPrendasDentro().size();
        lavadora.cargarPrenda(prendaElegida);
        int tamPosterior = lavadora.getPrendasDentro().size();

        // Si el tamaño de la lista de prendas dentro de la lavadora
        // ha aumentado, significa que la prenda se cargó con éxito
        if (tamPosterior > tamAnterior) {
            prendaElegida.setDisponible(false);
        }
    }

    private static void verPrendasEnLavadora(Lavadora lavadora) {
        List<Prenda> prendasEnLavadora = lavadora.getPrendasDentro();
        if (prendasEnLavadora.isEmpty()) {
            System.out.println("La lavadora no contiene prendas.");
        } else {
            System.out.println("Prendas en la lavadora:");
            for (Prenda p : prendasEnLavadora) {
                System.out.println("- " + p);
            }
        }
    }

    private static void definirCicloLavado(Lavadora lavadora) {
        System.out.print("Introduce el ciclo de lavado (Rápido, Algodón, etc.): ");
        String ciclo = sc.nextLine();
        lavadora.definirCicloDeLavado(ciclo);
    }

    // --------------------- LECTURA DE DATOS POR CONSOLA ---------------------
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Debe introducir un número entero: ");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return valor;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.print("Debe introducir un número decimal: ");
            sc.next();
        }
        double valor = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        return valor;
    }

    public static void main(String[] args) {
        inicializarDatos();

        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("\nElige una opción: ");

            switch (opcion) {
                case 1:
                    mostrarPrendas();
                    break;
                case 2:
                    anadirPrenda();
                    break;
                case 3:
                    modificarSuciedadPrenda();
                    break;
                case 4:
                    operarLavadoras();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige nuevamente.");
            }
        }
    }
}
