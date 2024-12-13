package streams_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    private String title;
    private List<String> directors;
    private String genre;
    private long duration;

    @Override
    public String toString() {
        return title;
    }
}
