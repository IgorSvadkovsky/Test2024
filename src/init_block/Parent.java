package init_block;

public class Parent {
    private String s;

    static {
        System.out.println("From static block parent");
    }

    {
        System.out.println("From dynamic block parent");
    }

    public Parent(String s) {
        System.out.println("From constructor parent");
        this.s = s;
    }
}
