package abstract_class;

public class Car extends BasicCar implements TransportInterface, AnotherInterface {

    @Override
    public void transportInterfaceMethod() {
        System.out.println("...");
    }

    @Override
    public void anotherInterface() {

    }
}
