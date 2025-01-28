public class Lavadora {
    private Prenda[] prendas;
    private int capacidad;
    private int contadorPrendas;
    private String puerta = "cerrada";
    private boolean enProcesoDeLavado = false;

    public Lavadora(int capacidad) {
        this.capacidad = capacidad;
        this.prendas = new Prenda[capacidad];
        this.contadorPrendas = 0;
    }

    public String abrirPuerta() {
        if (enProcesoDeLavado) return "Error: Lavado en proceso";
        puerta = "abierta";
        return "Puerta abierta";
    }

    public String introducirPrenda(Prenda prenda) {
        if (!puerta.equals("abierta")) return "Abra la puerta primero";
        if (contadorPrendas >= capacidad) return "Capacidad llena";
        prendas[contadorPrendas++] = prenda;
        return "Prenda añadida";
    }

    public Prenda[] obtenerPrendas() {
        Prenda[] resultado = new Prenda[contadorPrendas];
        System.arraycopy(prendas, 0, resultado, 0, contadorPrendas);
        return resultado;
    }

    // Resto de métodos manteniendo misma lógica...
}
