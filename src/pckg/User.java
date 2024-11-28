package pckg;

public class User extends BasicUser {

    @Override
    public int act() {
        System.out.println("Act as user");
        return 0;
    }

    public float sumMethod(float a, float b) {
        return a + b;
    }
}
