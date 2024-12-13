package streams_2.util;

import streams_2.Movie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGrouping {
    public static void main(String[] args) {
        Map<String, List<Movie>> moviesByGenre = Util.getMoviesList().stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println("moviesByGenre = " + moviesByGenre);
    }
}
