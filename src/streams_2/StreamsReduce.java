package streams_2;

import streams_2.util.Util;

import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsReduce {
    public static void main(String[] args) {
        Optional<Long> totalDuration = Util.getMoviesList().stream()
                .map(Movie::getDuration)
                .reduce(Long::sum);
        System.out.println("totalDuration = " + totalDuration.get());

        Long totalDuration1 = Util.getMoviesList().stream()
                .map(Movie::getDuration)
                .reduce(0L, Long::sum);
        System.out.println("totalDuration1 = " + totalDuration1);

        Optional<Long> totalDuration2 = Util.getMoviesList().stream()
                .map(Movie::getDuration)
                .collect(Collectors.reducing((duration1, duration2) -> duration1 + duration2));

        Long totalDuration3 = Util.getMoviesList().stream()
                .map(Movie::getDuration)
                .collect(Collectors.reducing(0L, (duration1, duration2) -> duration1 + duration2));

        Long totalDuration4 = Util.getMoviesList().stream()
                .map(Movie::getDuration)
                .reduce(0L, (duration1, duration2) -> duration1 + duration2);
    }
}
