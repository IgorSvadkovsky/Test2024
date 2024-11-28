package pckg;

import java.util.Objects;

public class Parent extends GrandParent {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age && name.equals(parent.name);
    }
    // x.equals(x)
    // x.equals(y) y.equals(x)
    // x.equals(y) y.equals(z) x.equals(z)
    // x.equals(y)
    // x.equals(null)

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Parent: ....";
    }
}
