package generics.old;

public class GenericUser<T> {
    private T value;

    public T printAndReturnValue(T value) {
        System.out.println(value);
        return value;
    }
}
