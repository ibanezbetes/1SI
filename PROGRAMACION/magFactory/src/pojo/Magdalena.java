package pojo;

public class Magdalena {
    // ATRIBUTOS
    public String sabor;
    public String color;
    public int diametro;
    // CONSTRUCTORES
    public Magdalena(int diametro, String sabor, String color) {
        //System.out.println("Diámetro: " + diametro);
        this.diametro = diametro;
        //System.out.println("Color: " + color);
        this.sabor = sabor;
        //System.out.println("Sabor: " + sabor);
        this.color = color;
    }
    // MÉTODOS
    /*public void hornear() {
        System.out.println("Hornear la magdalena");
        System.out.println(" de " + this.sabor + ".");
        System.out.println("Estoy horneando.");
    }

    public void mezclar() {
        System.out.println("Mezclar la magdalena");
        System.out.println(" de " + this.diametro + "cm, " + this.sabor + " y este color: " + this.color + ".");
        System.out.println("Estoy mezclando.");
    }

     */
}
