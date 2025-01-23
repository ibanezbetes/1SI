public class Main {
    public static void main(String[] args) {
        DynamicMovieArray movieList = new DynamicMovieArray();

        movieList.addMovie(new Movie("El Señor de los Anillos"));
        movieList.addMovie(new Movie("Matrix"));
        movieList.addMovie(new Movie("Interstellar"));
        movieList.addMovie(new Movie("Inception"));
        movieList.addMovie(new Movie("El efecto mariposa"));
        movieList.addMovie(new Movie("El padrino"));
        movieList.addMovie(new Movie("Pokemon"));
        movieList.addMovie(new Movie("Shrek"));
        movieList.addMovie(new Movie("El show de Thruman"));
        movieList.addMovie(new Movie("23"));


        movieList.displayMovies();
    }
}
