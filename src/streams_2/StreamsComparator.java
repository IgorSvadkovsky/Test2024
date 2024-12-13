package streams_2;

import streams_2.util.Util;

import java.util.Comparator;

public class StreamsComparator {
    public static void main(String[] args) {
        Util.getMoviesList().stream()
                .sorted(Comparator.comparing(Movie::getDuration))
                .forEach(System.out::println);
    }
}
