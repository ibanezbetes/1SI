package armas;

 public abstract class Arma {

     protected String nombre;

     public Arma(String nombre){

     }

     @Override
     public String toString() {
         return "Arma{" +
                 "nombre='" + nombre + '\'' +
                 '}';
     }
 }
