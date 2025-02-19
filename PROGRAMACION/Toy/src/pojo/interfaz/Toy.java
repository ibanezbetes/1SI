package pojo.interfaz;

public abstract class Toy implements Talk,Move,Fly {
    protected String nombre;


    public Toy() {

    }

    public Toy(String nombre) {
        this.nombre = nombre;    // THIS HACE QUE LA VARUABLE TEMPORAL SE CONVIERTA EN PERMANENTE-> TEMPORAL ES EL nombre que es la que sale en toy y la del this es la private
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirAtributos() {
        System.out.println(this.nombre); //ACCEDO A LA PERMANETE QUE HE GUARDADO ANTES

    }



    @Override
    public abstract void fly();

    @Override
    public abstract void move();

    @Override
    public abstract void talk();

    public abstract void comer();

}
