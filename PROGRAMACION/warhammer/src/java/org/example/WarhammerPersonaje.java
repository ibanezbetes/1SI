package java.org.example;

public class WarhammerPersonaje {
    private String nombre;
    private int energia;
    // protected HAshMap<String, Arma> armas;
    private static int contPersonajes;
    private static final int ENERGIA_MAX = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }
    public void sumarEnergia(){

    }
    public static void toNumPersonajes(){
        System.out.println("");
        //return int;
    }

    public String imprimirArmas (){
        return "";
    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }


}
