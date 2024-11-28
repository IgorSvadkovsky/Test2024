package rhombus_problem;

public class SomeClass implements B, C {
    @Override
    public void someDefMeth() {
        C.super.someDefMeth();
    }
}
