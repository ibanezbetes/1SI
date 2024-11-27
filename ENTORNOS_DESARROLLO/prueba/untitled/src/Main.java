import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
/* Comentarios en párrafo
    muchas líneas
    contenedor
 */
        for (int contador = 0; contador < 5; contador++) {
            int i = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Valor aleatorio en la iteración " + (contador + 1) + ": " + i);
        }
    }
}
// así también se puede comentar, una sola línea