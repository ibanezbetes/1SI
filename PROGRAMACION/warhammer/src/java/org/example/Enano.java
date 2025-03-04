package java.org.example;

public abstract class Enano extends WarhammerPersonaje {
    // ME PIDEN NOMBRE Y PUEBLO DE NACIMIENTO

    // NOMBRE YA LE VIENE HEREDADO ASI QUE LE METEMOS PUEBLO

    //ATRIBUTOS
    private int riqueza;
    private static int contEnanos;
    protected int nivel;

    // CONSTRUCTOR -> con el pueblo de nacimiento y el nivel

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }


    //MÉTODOS HEREDADOS


    @Override
    public void SumarEnergia() {
        super.SumarEnergia();
    }


    //MÉTODOS PROPIOS -> EXTIENDE

    // GETTER , SETTER
    // NOS PIDEN SOLO EL GET CONTADOR PIELES VERDER

    public static int getContEnanos() {
        return contEnanos;
    }


    // MÉTODO AÑADIR ARMA ATAQUE

    public void addArmaAtaque(ArmaAtaque arma){ // LE TENDRÁS QUE METER PARÁMETRO DE ENTRADA PASARLE UN ARMA DE ATAQUE, ESTA CLASE LA PREPARAREMOS LUEGO.

    }


    // MÉTODO AÑADIR ARMA DEFENSA

    public void addArmaDefensa(ArmaDefensa arma){ // LE TENDRÁS QUE METER PARÁMETRO DE ENTRADA PASARLE UN ARMA DE DEFENSA, ESTA CLASE LA PREPARAREMOS LUEGO.

    }


    public String imprimirArmas(){
        // ESTAS ARMAS LAS TIENES QUE RECORRER DEL HASHMAP DE ARMAS E IMPRIMIRLAS
        // RECORRER HAS MAP, Y PREPARAR CADENA
        return "";
    }

    // TO STRING


    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }
}