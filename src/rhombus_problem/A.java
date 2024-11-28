package rhombus_problem;

public interface A {
    static void someStaticMeth() {
        System.out.println("From static A");
    }

    default void someDefMeth() {
        System.out.println("Default from A");
    }
}
