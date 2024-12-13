package streams_2;

import streams_2.util.Util;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollectors {
    public static void main(String[] args) {
        List<String> strsList = Stream.of("One", "Two", "Three", "One").collect(Collectors.toList());
        List<String> strsList1 = Stream.of("One", "Two", "Three", "One").toList();

        Set<String> strsSet = Stream.of("One", "Two", "Three", "One").collect(Collectors.toSet());

//        System.out.println("strsList = " + strsList);
//        System.out.println("strsSet = " + strsSet);


//        Map<String, Movie> moviesByGenre = Util.getMoviesList().stream()
//                .collect(Collectors.toMap(Movie::getGenre, Function.identity()));
//        System.out.println("moviesByGenre = " + moviesByGenre);


        Map<String, Movie> moviesByGenre = Util.getMoviesList().stream()
                .collect(Collectors.toMap(Movie::getGenre, Function.identity(), (x, y) -> x));
//        System.out.println("moviesByGenre = " + moviesByGenre);

        Map<String, Movie> moviesByGenre1 = Util.getMoviesList().stream()
                .collect(Collectors.toMap(Movie::getGenre, Function.identity(), (x, y) -> x, LinkedHashMap::new));
//        System.out.println("moviesByGenre1 = " + moviesByGenre1);


        Long totalDuration = Util.getMoviesList().stream()
                .collect(Collectors.summingLong(Movie::getDuration));
        System.out.println("totalDuration = " + totalDuration);

        Long totalDuration1 = Util.getMoviesList().stream()
                .mapToLong(Movie::getDuration)
                .sum();

        double averageDuration = Util.getMoviesList().stream()
                .collect(Collectors.averagingLong(Movie::getDuration));
        System.out.println("averageDuration = " + averageDuration);

        Optional<Movie> maxDurationMovie = Util.getMoviesList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Movie::getDuration)));
        maxDurationMovie.ifPresent(movie -> System.out.println("maxDurationMovie = " + movie));

        Optional<Movie> maxDurationMovie1 = Util.getMoviesList().stream()
                .max(Comparator.comparing(Movie::getDuration));
    }
}
