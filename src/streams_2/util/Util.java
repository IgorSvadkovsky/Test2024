package streams_2.util;

import streams_2.Movie;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Movie> getMoviesList() {
        List<Movie> movies = new ArrayList<>();

        // new Movie("" ,"", 100)

        movies.add(Movie.builder()
                .title("The Silence of the Lambs")
                .directors(List.of("Jonathan Demme", "Random guy"))
                .genre("horror")
                .duration(120)
                .build());

        movies.add(Movie.builder()
                .title("Pulp Fiction")
                .directors(List.of("Quentin Tarantino"))
                .genre("crime")
                .duration(150)
                .build());

        movies.add(Movie.builder()
                .title("Psycho")
                .directors(List.of("Alfred Hitchcock"))
                .genre("horror")
                .duration(110)
                .build());

        movies.add(Movie.builder()
                .title("Home Alone")
                .directors(List.of("John Hughes", "Random guy"))
                .genre("comedy")
                .duration(100)
                .build());

        return movies;
    }
}
