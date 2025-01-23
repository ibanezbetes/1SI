public class DynamicMovieArray {
    private Movie[] movies;
    private int numberOfMovies;

    public DynamicMovieArray() {
        movies = new Movie[0];
        numberOfMovies = 0;
    }


    public void addMovie(Movie movie) {
        Movie[] newMoviesArray = new Movie[numberOfMovies + 1];

        for (int i = 0; i < numberOfMovies; i++) {
            newMoviesArray[i] = movies[i];
        }

        newMoviesArray[numberOfMovies] = movie;

        movies = newMoviesArray;

        numberOfMovies++;
    }

    public void displayMovies() {
        System.out.println("Lista de películas:");
        for (int i = 0; i < numberOfMovies; i++) {
            System.out.println((i + 1) + ". " + movies[i].getTitle());
        }
    }
}
