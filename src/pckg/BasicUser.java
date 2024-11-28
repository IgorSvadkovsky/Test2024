package pckg;

public class BasicUser { // Camel case
    private int age;
    private String name;
    public static final int MAX_AGE = 140;

    public BasicUser() {
    }

    public BasicUser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public BasicUser(String name) {
        this.name = name;
    }

    public int act() {
        System.out.println("Act as basic user");
        return 0;
    }

    public int sumMethod(int a, int b) {
        return a + b;
    }

    public static void someStaticMethod() {
        System.out.println("....");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} // boilerplate code

// Lombok

