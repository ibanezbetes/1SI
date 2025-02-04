public class Main {
    public static void main(String[] args) {
        // Crea una instancia del almacén
        AlmacenMusica almacenMusica = new AlmacenMusica();

        // Crea algunas canciones
        Cancion cancion1 = new Cancion("Oasis", "Wonderwall", "Pop", 1895);
        Cancion cancion2 = new Cancion("Back in black", "AC/DC", "Rock", 1982);

        // Añade las canciones al almacén
        System.out.println("");

        almacenMusica.addCancion(cancion1);
        almacenMusica.addCancion(cancion2);
        System.out.println("");

        // Imprime el estado actual del almacén
        almacenMusica.imprimir();
        System.out.println("");


        // Actualiza la canción 1: se busca por título, por lo que se crea una nueva instancia
        // con el mismo título pero con otros datos.
        Cancion cancion1Actualizada = new Cancion("Oasis", "Wonderwall", "Pop", 1995);
        almacenMusica.updateCancion(cancion1Actualizada);
        System.out.println("");

        // Imprime el almacén tras la actualización
        almacenMusica.imprimir();
        System.out.println("");

        // Elimina la canción 2. De nuevo, se identifica por título.
        almacenMusica.deleteCancion(cancion2);

        // Imprime el almacén tras la eliminación
        System.out.println("");
        almacenMusica.imprimir();
    }
}
