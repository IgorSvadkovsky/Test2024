package rhombus_problem;

public class Main {
    public static void main(String[] args) {
        A someObj = new SomeClass();
        someObj.someDefMeth();

        A.someStaticMeth();
    }
}

//              interface A
//              /       \
//      interface B      interface C
//              \       /
//                class D
