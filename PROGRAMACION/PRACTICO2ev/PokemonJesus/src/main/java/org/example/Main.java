package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bulbasaur bulbasaur= new Bulbasaur("Bulbasaur",10,9);
        Charmander charmander=new Charmander("Charmander",12,2);
        Pikachu pikachu=new Pikachu("Pikachu",4,6);
        Squirtle squirtle=new Squirtle("Squirtle",7,12);

        bulbasaur.mostrarInfo();
        charmander.mostrarInfo();
        pikachu.mostrarInfo();
        squirtle.mostrarInfo();

        bulbasaur.ataqueLatigoCepa();
        bulbasaur.ataqueDrenadoras();

        charmander.ataqueAscuas();
        charmander.ataqueFuegazo();

        squirtle.ataqueBurbuja();
        squirtle.ataqueHidropulso();

        pikachu.ataqueImpactrueno();
        pikachu.ataqueRapido();

        


        }
    }
