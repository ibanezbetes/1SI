package pojo.interfaz;

public class Woody1 extends Toy{
    private String complementos;
    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
        //System.out.println(super.nombre); //ACCEDO A LA PERMANETE QUE HE GUARDADO ANTES
        System.out.println(this.complementos);


    }

    public Woody1(String nombre) {
        super(nombre);
        this.complementos="Gorro";
    }

    @Override
    public void fly() {
        System.out.println("VOLAR");
    }

    @Override
    public void move() {
        System.out.println("MOVER");
    }

    @Override
    public void talk() {
        System.out.println("HABLAR");
    }

    @Override
    public void comer() {
        System.out.println("COMER");
    }




    public Woody1(){
        super();
    }
}
