package Lavadora;

import java.util.ArrayList;
import java.util.List;

public class Lavadora {
    private int capacidadCarga;          // Capacidad en kg
    private String cicloDeLavado;
    private boolean estaLlena;           // Indica si hay ropa o no
    private String estadoActual;         // Encendida, Apagada, etc.
    private int tiempoRestanteLavado;
    private String procesoActual;        // Lavando..., Centrifugando..., etc.
    private String estadoPuerta;         // Abierta o Cerrada
    private String pantallaEstado;       // Operativa, Inactiva, etc.
    private int velocidadTambor;
    private int temperaturaActual;
    private String compartimentoDetergente;
    private int volumenCompartimento;
    private String tambor;
    private String nivelDetergente;
    private boolean procesoEnCurso;
    private boolean detergenteAdecuado;

    // NUEVO: lista de prendas que están dentro de la lavadora
    private List<Prenda> prendasDentro;

    // Constructor
    public Lavadora(int capacidadCarga, String cicloDeLavado) {
        this.capacidadCarga = capacidadCarga;
        this.cicloDeLavado = cicloDeLavado;
        this.estadoPuerta = "Cerrada";
        this.estadoActual = "Apagada";
        this.procesoActual = "Sin uso";
        this.pantallaEstado = "Inactiva";
        this.velocidadTambor = 0;
        this.temperaturaActual = 0;
        this.compartimentoDetergente = "Cerrado";
        this.volumenCompartimento = 2;  // Ejemplo de capacidad de detergente (litros)
        this.tambor = "Detenido";
        this.detergenteAdecuado = true;
        this.procesoEnCurso = false;
        this.prendasDentro = new ArrayList<>();
    }

    /**
     * Carga una prenda en la lavadora siempre y cuando:
     * - La puerta esté abierta.
     * - El peso total de las prendas dentro no supere la capacidad.
     */
    public void cargarPrenda(Prenda prenda) {
        if (!estadoPuerta.equals("Abierta")) {
            System.out.println("No se puede cargar la prenda. La puerta está cerrada.");
            return;
        }

        double pesoActual = obtenerPesoTotalPrendas();
        if (pesoActual + prenda.getPeso() > capacidadCarga) {
            System.out.println("No se puede cargar la prenda. Capacidad excedida. " +
                    "Capacidad máxima: " + capacidadCarga + " kg.");
            return;
        }

        prendasDentro.add(prenda);
        estaLlena = true;
        System.out.println("Prenda cargada: " + prenda.getNombre() +
                " (Peso: " + prenda.getPeso() + " kg).");
    }

    /**
     * Devuelve la lista de prendas que están dentro de la lavadora.
     */
    public List<Prenda> getPrendasDentro() {
        return prendasDentro;
    }

    /**
     * Retira todas las prendas de la lavadora (al terminar el ciclo o manualmente).
     * Y las marca como disponibles de nuevo, si así lo deseas.
     */
    public void retirarTodasPrendas() {
        if (prendasDentro.isEmpty()) {
            System.out.println("No hay prendas que retirar.");
        } else {
            // Al retirarlas, podemos dejarlas disponibles de nuevo
            for (Prenda p : prendasDentro) {
                p.setDisponible(true);
            }
            prendasDentro.clear();
            estaLlena = false;
            System.out.println("Todas las prendas han sido retiradas de la lavadora.");
        }
    }

    /**
     * Retira una prenda en concreto de la lavadora (opcional).
     */
    public void retirarPrenda(Prenda prenda) {
        if (prendasDentro.remove(prenda)) {
            // Se la volvemos a marcar como disponible, si queremos
            prenda.setDisponible(true);
            System.out.println("Se retiró la prenda: " + prenda.getNombre());
            if (prendasDentro.isEmpty()) {
                estaLlena = false;
            }
        } else {
            System.out.println("La prenda no estaba en la lavadora.");
        }
    }

    /**
     * Obtiene el peso total de las prendas dentro de la lavadora
     */
    private double obtenerPesoTotalPrendas() {
        double total = 0;
        for (Prenda p : prendasDentro) {
            total += p.getPeso();
        }
        return total;
    }

    // --------------------- MÉTODOS ORIGINALES ---------------------
    public void encenderLavadora() {
        estadoActual = "Encendida";
        pantallaEstado = "Operativa";
        System.out.println("Lavadora encendida.");
    }

    public void definirCicloDeLavado(String ciclo) {
        cicloDeLavado = ciclo;
        if (ciclo.equalsIgnoreCase("Rápido")) {
            velocidadTambor = 800;
            temperaturaActual = 30;
            tiempoRestanteLavado = 30;
        } else if (ciclo.equalsIgnoreCase("Algodón")) {
            velocidadTambor = 600;
            temperaturaActual = 40;
            tiempoRestanteLavado = 60;
        } else {
            // Ciclo genérico
            velocidadTambor = 500;
            temperaturaActual = 20;
            tiempoRestanteLavado = 45;
        }
        pantallaEstado = "En funcionamiento";
        System.out.println("Ciclo de lavado establecido: " + cicloDeLavado);
    }

    public void abrirCompartimentoDetergente() {
        compartimentoDetergente = "Abierto";
        System.out.println("Compartimento de detergente abierto.");
    }

    public void cargarDetergente(int cantidad) {
        if (cantidad <= volumenCompartimento) {
            nivelDetergente = "Suficiente";
            detergenteAdecuado = true;
            System.out.println("Detergente cargado: " + cantidad + " litros.");
        } else {
            nivelDetergente = "Insuficiente";
            detergenteAdecuado = false;
            System.out.println("Cantidad insuficiente de detergente (excede la capacidad de "
                    + volumenCompartimento + " litros).");
        }
    }

    public void cerrarCompartimentoDetergente() {
        compartimentoDetergente = "Cerrado";
        System.out.println("Compartimento de detergente cerrado.");
    }

    public void iniciarCiclo() {
        if (!detergenteAdecuado) {
            System.out.println("No se puede iniciar el ciclo, falta detergente adecuado.");
        } else if (prendasDentro.isEmpty()) {
            System.out.println("No hay prendas cargadas. No se puede iniciar el ciclo.");
        } else {
            procesoActual = "Lavando...";
            pantallaEstado = "En uso";
            procesoEnCurso = true;
            System.out.println("Iniciando ciclo de lavado. " + procesoActual);
        }
    }

    public void establecerTemporizador() {
        if (procesoEnCurso) {
            while (tiempoRestanteLavado > 0) {
                System.out.println("Tiempo restante: " + tiempoRestanteLavado + " minutos");
                tiempoRestanteLavado--;
                try {
                    Thread.sleep(300); // Reducido para no alargar la ejecución
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            terminarCiclo();
        } else {
            System.out.println("El ciclo no ha comenzado.");
        }
    }

    public void abrirPuertaLavadora() {
        if (procesoEnCurso) {
            System.out.println("No se puede abrir la puerta durante el ciclo.");
        } else {
            estadoPuerta = "Abierta";
            System.out.println("Puerta abierta.");
        }
    }

    public void cerrarPuertaLavadora() {
        estadoPuerta = "Cerrada";
        System.out.println("Puerta cerrada.");
    }

    // Versión 1.0 de cargar ropa (para mantener compatibilidad)
    public void cargarRopa(int cantidadRopa) {
        if (cantidadRopa > capacidadCarga) {
            System.out.println("Carga excedida. No puede superar " + capacidadCarga + " kg.");
        } else {
            estaLlena = true;
            System.out.println("Ropa cargada (versión 1.0): " + cantidadRopa + " kg.");
        }
    }

    public void terminarCiclo() {
        procesoEnCurso = false;
        estadoActual = "Ciclo terminado";
        velocidadTambor = 0;
        tambor = "Detenido";
        pantallaEstado = "Inactiva";
        System.out.println("Ciclo de lavado terminado.");
    }

    // Versión 1.0 de retirar ropa (para mantener compatibilidad)
    public void retirarRopa() {
        estaLlena = false;
        System.out.println("Ropa retirada (versión 1.0).");
    }

    public void apagarLavadora() {
        estadoActual = "Apagada";
        pantallaEstado = "Inactiva";
        System.out.println("Lavadora apagada.");
    }

    // ---------------- GETTERS & SETTERS ÚTILES ----------------
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getCicloDeLavado() {
        return cicloDeLavado;
    }

    public boolean isProcesoEnCurso() {
        return procesoEnCurso;
    }
}
