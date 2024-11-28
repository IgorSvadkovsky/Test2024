package abstract_class;

public class Main {
    public static void main(String[] args) {
//        var myClass = new MyAbstractClass();
        var car = new Car();

//        car.staticInterfaceMeth();

        var child = new Child();

        Child.staticMeth();
    }
}
