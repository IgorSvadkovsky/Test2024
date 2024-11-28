package init_block;

public class InitBlockClass {
    private static final int a;
    private String s;

    static {
        a = 9;
        System.out.println("From static block");
    }

    {
        System.out.println("From dynamic block");
    }

    public InitBlockClass(String s) {
        this.s = s;
    }

    public InitBlockClass() {
    }

    public void method() {
        System.out.println("From constructor");
    }

    public static void staticMethod() {
        System.out.println("From static method");
    }
}
