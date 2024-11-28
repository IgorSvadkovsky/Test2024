package generics;

import generics.car.Bolid;

public class Racer<T extends Bolid> extends CarHolder<T> {
    public Racer(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("driving race car");
    }

//    public static <S> void printHorsepower(CarHolder<S> carHolder) {
//        System.out.println();
//    }
}
