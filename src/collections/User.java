package collections;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
//public class User implements Comparable<User> {
public class User {
    private int id;
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id && age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

//    @Override
//    public int compareTo(User user) {
//        int nameCompare = this.name.compareTo(user.name);
//        if (nameCompare != 0) {
//            return nameCompare;
//        }
//        return Integer.compare(id, user.id);
//    }
}
