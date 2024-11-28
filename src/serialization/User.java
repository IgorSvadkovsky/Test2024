package serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class User implements Serializable, Cloneable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int age;
    private transient String name;

    public User(User user) {
        this.age = user.age;
        this.name = user.name;
    }

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
