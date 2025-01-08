package pojo;

public class Magdalena {
    // ATRIBUTOS
    String sabor;
    String color;
    int diametro;
    // CONSTRUCTOR
    // public Magdalena(){} //CONTRASEÑA VACÍA
    public Magdalena(String sabor, String color){
        System.out.println("Color" + color);
        System.out.println("Sabor" + sabor);
        sabor = sabor;
        this.sabor = sabor;
        color = color;
        this.color = color;
    }
    public Magdalena(String sabor){
        System.out.println("Sabor" + sabor);
        sabor = sabor;
        this.sabor = sabor;
    }
    public Magdalena(int diametro, String sabor, String color){
        System.out.println("Diametro: " + diametro);
        diametro = diametro;
        this.diametro = diametro;
        System.out.println("Color" + color);
        System.out.println("Sabor" + sabor);
        sabor = sabor;
        this.sabor = sabor;
        color = color;
        this.color = color;
    }
    // METODO
    public void hornear(){
        System.out.println("Hornear la magdalena");
        System.out.println(" de " + this.sabor + ".");
        System.out.println("Estoy horneando.");
    }
    public void mezclar(){
        System.out.println("Mezclar la magdalena");
        System.out.println(" de " + this.diametro + "cm, " + this.sabor + " y este color: " + this.color + ".");
        System.out.println("Estoy mezclando.");
    }
}
