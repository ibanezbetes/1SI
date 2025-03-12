import ataques.DestelloSolar;
import ataques.EstallidoEstelar;
import ataques.LlamaradaSagrada;
import ataques.PulsarGalactico;
import pelea.Batalla;
import pelea.Maestro;
import pelea.TorneoGalactico;
import personajes.Guerrero;
import personajes.Nova;
import personajes.Solar;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        //  --------------------1-----------------------------


        Nova nova1= new Nova("Nova 1",15,100);
        Nova nova2= new Nova("Nova 2",15,100);

        Solar solar1= new Solar("Solar 1",15,100);
        Solar solar2= new Solar("Solar 2",15,100);

        ArrayList<Nova>listNova=new ArrayList<>();
        listNova.add(nova1);
        listNova.add(nova2);

        ArrayList<Solar>listSolar=new ArrayList<>();
        listSolar.add(solar1);
        listSolar.add(solar2);


        //---------------------2-----------------------------
        System.out.println("LISTA ATAQUES");
        System.out.println();
        Random alea=new Random();
        for (Nova nova : listNova) {
            if (alea.nextBoolean()){
                nova.agregarAtaque(new EstallidoEstelar());
                System.out.println("Estallido Estelar asignado a " + nova.getNombre());
            }else {
                nova.agregarAtaque(new PulsarGalactico());
                System.out.println("Pulso Galactico asignado a " + nova.getNombre());
            }
        }
        System.out.println();
        for (Solar solar : listSolar){
            if (alea.nextBoolean()){
                solar.agregarAtaque(new DestelloSolar());
                System.out.println("Destello Solar asignado a " + solar.getNombre());
            }else{
                solar.agregarAtaque(new LlamaradaSagrada());
                System.out.println("LLamarada Sagrada asignado a " + solar.getNombre());
            }
        }

        //---------------------------3---------------------
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("LISTA GUERREROS");
        System.out.println();
        for (Nova nova:listNova){
            System.out.println(nova);
        }
        System.out.println();
        for (Solar solar : listSolar) {
            System.out.println(solar);
        }

        //------------------------4----------------------
        System.out.println();
        System.out.println("Total de guerreros creados: " + Guerrero.getContadorGuerreros());
        System.out.println();
        //-----------------------5----------------------------
        System.out.println("LISTA MAESTROS");
        Maestro maestro1 = new Maestro("Maestro 1");
        Maestro maestro2 = new Maestro("Maestro 2");
        System.out.println();
        maestro1.reclutarGuerrero(nova1);
        maestro1.reclutarGuerrero(solar1);
        maestro2.reclutarGuerrero(nova2);
        maestro2.reclutarGuerrero(solar2);
        System.out.println("Lista de maestros: " + maestro1 + " vs " +maestro2);
        System.out.println();
        //-----------------------------6------------------------
        Batalla batalla1=new Batalla(maestro1,maestro2);
        batalla1.iniciarBatalla();

        //---------------------------7--------------------------
        System.out.println("BATALLA FINAL");
        System.out.println();
        TorneoGalactico torneoGalactico=new TorneoGalactico("300€");
        torneoGalactico.agregarBatalla(batalla1);
        torneoGalactico.iniciarTorneo();
        System.out.println("Batalla inicada: " + torneoGalactico);



    }
}