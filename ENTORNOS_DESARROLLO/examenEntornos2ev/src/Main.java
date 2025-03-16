import java.util.Date;
public class Main {
    public static void main(String[] args) {

        //aqui abajo creamos objetos de cada clase:

        Empleado emp1 = new Empleado("Calamardo","Calamar","Calle Lolez",new Date(),1000,5);
        Repartidor rep1 = new Repartidor("Bob Esponja","Esponja","Casa piña",new Date(),1500,"Lancha Submarina",false);
        Cliente c1 = new Cliente("Patricio","Estrella","Al lado de Bob",0);
        Pedido p1 = new Pedido(new Date(),c1,emp1,rep1);
        System.out.println(emp1);
        System.out.println(rep1);
        System.out.println(c1);
        System.out.println(p1);

        //aqui abajo borramos objetos de cada clase:

        emp1 = null;
        rep1 = null;
        c1 = null;
        p1 = null;
    }
}