package LAVADORA;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora(7, "Ahorro");
        Lavadora lavadora2 = new Lavadora(8, "Algodón");
        Lavadora lavadora3 = new Lavadora(7, "Blanca");


        System.out.println("Lavadora 1:");
        lavadora1.abrirPuerta();
        lavadora1.introducirRopa(5);
        lavadora1.cerrarPuerta();
        lavadora1.encender();
        lavadora1.definirPlanDeLavado("Ahorro");
        lavadora1.abrirCajetil();
        lavadora1.introducirDetergente(1);
        lavadora1.cerrarCajetil();
        lavadora1.iniciarLavado();
        lavadora1.establecerContadorLavadora();
        lavadora1.retirarRopa();
        lavadora1.apagar();


        System.out.println("Lavadora 2:");
        lavadora2.abrirPuerta();
        lavadora2.introducirRopa(6);
        lavadora2.cerrarPuerta();
        lavadora2.encender();
        lavadora2.definirPlanDeLavado("Algodón");
        lavadora2.abrirCajetil();
        lavadora2.introducirDetergente(1);
        lavadora2.cerrarCajetil();
        lavadora2.iniciarLavado();
        lavadora2.establecerContadorLavadora();
        lavadora2.retirarRopa();
        lavadora2.apagar();


        System.out.println("Lavadora 3:");
        lavadora3.abrirPuerta();
        lavadora3.introducirRopa(8);
        lavadora3.cerrarPuerta();
        lavadora3.encender();
        lavadora3.definirPlanDeLavado("Blanca");
        lavadora3.abrirCajetil();
        lavadora3.introducirDetergente(1);
        lavadora3.cerrarCajetil();
        lavadora3.iniciarLavado();
        lavadora3.establecerContadorLavadora();
        lavadora3.retirarRopa();
        lavadora3.apagar();
    }
}
