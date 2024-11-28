package generics;

import generics.car.Taxi;

public class TaxiDriver<T extends Taxi> extends CarHolder<T> {

    public TaxiDriver(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("driving taxi");
    }
}
