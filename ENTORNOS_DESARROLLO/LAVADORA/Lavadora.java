package LAVADORA;

public class Lavadora {
    private int capacidad;
    private String planDeLavado;
    private boolean llena;
    private String estado;
    private int contadorTiempoLavado;
    private String estadoLavado;
    private String puerta;
    private String pantalla;
    private int revolucionesPorMinuto;
    private int temperaturaAgua;
    private String cajetil;
    private int capacidadCajetil;
    private String tamborLavadora;
    private String detergente;
    private boolean enProcesoDeLavado;
    private boolean detergenteSuficiente;


    public Lavadora(int capacidad, String planDeLavado) {
        this.capacidad = capacidad;
        this.planDeLavado = planDeLavado;
        this.puerta = "Cerrado";
        this.estado = "Apagado";
        this.estadoLavado = "Sin lavar";
        this.pantalla = "Desuso";
        this.revolucionesPorMinuto = 0;
        this.temperaturaAgua = 0;
        this.cajetil = "Cerrado";
        this.capacidadCajetil = 0;
        this.tamborLavadora = "Inactivo";
        this.detergenteSuficiente = true;
        this.enProcesoDeLavado = false;
    }


    public void abrirPuerta() {
        if (enProcesoDeLavado) {
            System.out.println("Espera a que termine el lavado.");
        } else {
            puerta = "Abierto";
            System.out.println("Puerta abierta.");
        }
    }


    public void introducirRopa(int kilos) {
        if (kilos > capacidad) {
            System.out.println("No se puede cargar más de " + capacidad + " kg.");
        } else {
            llena = true;
            System.out.println("Ropa cargada: " + kilos + " kg.");
        }
    }


    public void cerrarPuerta() {
        puerta = "Cerrado";
        System.out.println("Puerta cerrada.");
    }


    public void encender() {
        estado = "ON";
        pantalla = "ON";
        System.out.println("Lavadora encendida.");
    }


    public void definirPlanDeLavado(String plan) {
        planDeLavado = plan;
        if (plan.equals("Ahorro.")) {
            revolucionesPorMinuto = 800;
            temperaturaAgua = 30;
            contadorTiempoLavado = 30; // minutos
        } else if (plan.equals("Algodón.")) {
            revolucionesPorMinuto = 600;
            temperaturaAgua = 40;
            contadorTiempoLavado = 60;
        }
        pantalla = "En uso";
        System.out.println("Programa de lavado: " + planDeLavado + ".");
    }


    public void abrirCajetil() {
        cajetil = "Abierto";
        System.out.println("Cajetil abierto.");
    }


    public void introducirDetergente(int cantidad) {
        if (cantidad <= capacidadCajetil) {
            detergente = "Suficiente";
            System.out.println("Detergente introducido: " + cantidad + " litros.");
        } else {
            detergente = "Insuficiente";
            System.out.println("Se necesita más detergente.");
            detergenteSuficiente = false;
        }
    }


    public void cerrarCajetil() {
        cajetil = "Cerrado";
        System.out.println("Cajetil cerrado");
    }


    public void iniciarLavado() {
        if (!detergenteSuficiente) {
            System.out.println("No se puede iniciar el lavado, no hay suficiente detergente.");
        } else {
            estadoLavado = "Lavando ropa...";
            pantalla = "En uso";
            enProcesoDeLavado = true;
            System.out.println(estadoLavado);
        }
    }


    public void establecerContadorLavadora() {
        if (enProcesoDeLavado) {
            while (contadorTiempoLavado > 0) {
                System.out.println("Tiempo restante: " + contadorTiempoLavado + " minutos");
                contadorTiempoLavado--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            finalizarLavado();
        } else {
            System.out.println("El lavado no ha comenzado.");
        }
    }


    public void finalizarLavado() {
        enProcesoDeLavado = false;
        estado = "Lavado finalizado";
        revolucionesPorMinuto = 0;
        tamborLavadora = "Inactivo";
        pantalla = "En desuso";
        System.out.println(estado);
    }


    public void retirarRopa() {
        llena = false;
        System.out.println("Ropa retirada.");
    }


    public void apagar() {
        estado = "Apagado";
        pantalla = "Desuso";
        System.out.println("Lavadora apagada.");
    }
}
