package generics.intro;

import lombok.Getter;

@Getter
public class CustomArray<T> {
    private T[] objects;
    private int size;

    public CustomArray(int initialSize) {
        objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }
}
