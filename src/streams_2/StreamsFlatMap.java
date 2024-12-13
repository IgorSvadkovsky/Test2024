package streams_2;

import streams_2.util.Util;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFlatMap {
    public static void main(String[] args) {
        List<String> moviesTitles = Util.getMoviesList().stream()
                .map(Movie::getTitle)
                .toList();
//        System.out.println("moviesTitles: " + moviesTitles);

        // flatMap     [[1,2], [3,4]]    flatMap -> [1,2,3,4]

        List<String> directorsList = Util.getMoviesList().stream()
                .flatMap(movie -> movie.getDirectors().stream())
                .toList();
        System.out.println("directorsList: " + directorsList);

        Set<String> directorsSet = Util.getMoviesList().stream()
                .flatMap(movie -> movie.getDirectors().stream())
                .collect(Collectors.toSet());
        System.out.println("directorsSet: " + directorsSet);
    }
}
