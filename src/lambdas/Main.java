package lambdas;

import collections.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Main {
    private static int field;

    public static void main(String[] args) {
        Comparator<Integer> comparator1 = new IntegerComparator();

        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        Comparator<Integer> comparator3 = (o1, o2) -> Integer.compare(o1, o2);

        Comparator<Integer> comparator4 = Integer::compare; // ссылка на статич метод

//        System.out.println(comparator2.compare(100, 85));

        System.out.println("*******************");

        IntUnaryOperator intUnaryOperator = x -> x * x;

        System.out.println(intUnaryOperator.applyAsInt(16));

        System.out.println("*******************");

        Consumer<User> consumer = System.out::println; // ссылка на нестатич метод

//        consumer.accept("text");
        consumer.accept(new User(1, 20, "a"));

        System.out.println("*******************");

        IntFunction<String[]> arrCreator = String[]::new; // ссылка на конструктор
        System.out.println(Arrays.toString(arrCreator.apply(5)));
    }

    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }

    public static void someStaticMethod() {
        int methodVariable = 1;
        final int[] methodVariable1 = {1};
//        methodVariable++;

        IntUnaryOperator intUnaryOperator = x -> {
            x = x + field;
            field++;

            x = x + methodVariable1[0];
            methodVariable1[0]++;

            x = x + methodVariable;
//            methodVariable; // ошибка компиляции

            return x;
        };
    }
}
