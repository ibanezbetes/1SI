package pojo;


import pojo.interfaz.Toy;
import pojo.interfaz.Woody1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Toy toy1 = new Toy();  //NUNCA PODEMOS INSTANCIAR UNA CLASE ABSTRACT, JERARQUIA DE HERENCIAS, PROHIBIR INSTAR PADRE Y SOLO PODEMOS A HIJO

        Toy woody1=new Woody1("Woody1"); //PQ HIJO SOBREESCRIBE METODO DEL PADRE , POR ESO COGE VALOR DE WOODY1
        Toy woody2=new Woody1("Woody2");

        woody1.imprimirAtributos();  //PAL MAIN SIEMPRE PUBLIC, PA PODER VER
        woody2.imprimirAtributos();
        ArrayList<Toy> lstToys= new ArrayList<>();
        lstToys.add(woody1);
        lstToys.add(woody2);
        //VINCULACION DINAMICA
        //POLIMORFISMO
    }
}