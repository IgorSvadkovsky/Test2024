package abstract_class;

public interface TransportInterface {
    int SIZE = 10;

    static void staticInterfaceMeth() {

    }

    void transportInterfaceMethod();

    default void anotherTransportInterfaceMethod() {
        staticInterfaceMeth();
        System.out.println("default real.");
    }
}
