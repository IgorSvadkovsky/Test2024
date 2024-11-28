package init_block;

public class Child extends Parent {
    private String s;

    static {
        System.out.println("From static block child");
    }

    {
        System.out.println("From dynamic block child");
    }

    public Child(String s) {
        super("");
        System.out.println("From constructor child");
        this.s = s;
    }
}
