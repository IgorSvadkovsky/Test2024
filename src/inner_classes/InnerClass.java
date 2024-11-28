package inner_classes;

import abstract_class.TransportInterface;

public class InnerClass {
    private int i;

    {

    }

    static {
    }

    public InnerClass(int i) {
        this.i = i;
    }

    public void method() {
        TransportInterface transportInterface = new TransportInterface() {
            @Override
            public void transportInterfaceMethod() {
                System.out.println("....");
            }
        };

        class LocalClass {

        }
    }

    class SimpleInnerClass {
        void innerMeth() {

        }
    }

    static class StaticInnerClass {

    }
}
