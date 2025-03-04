package java.org.example;

public class PilerVerde extends WarhammerPersonaje {
    //private private String nombre;
    private String puebloNacimiento;
    protected int nivel;
    private static int contPielesVerdes;

    public PilerVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    public static int getContPielesVerdes(){
        return 0;
    }
//public void addArmaAtaque(ArmaAtaque arma){
//
//}

//public void addArmaDefensa(ArmaDefensa arma){
//
//}

public String imprimirArmas(){
        //Recorrer HashMap y preparar cadena
        return "";
    }

    @Override
    public String toString() {
        return "PilerVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
