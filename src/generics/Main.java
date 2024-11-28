package generics;

import generics.car.Bolid;
import generics.car.Car;
import generics.car.Taxi;

public class Main {
    public static void main(String[] args) {
        TaxiDriver<Taxi> taxiDriver = new TaxiDriver<>("taxi_dr_name");
        taxiDriver.setCar(new Taxi());

        Racer<Bolid> racer = new Racer<>("racer_name");
        racer.setCar(new Bolid());

//        TaxiDriver<String> taxiDriver1 = new TaxiDriver<>("taxi_dr_name");
//        taxiDriver.setCar(new Taxi());

//        Racer<Taxi> racer1 = new Racer<>("racer_name");
//        racer.setCar(new Bolid());

        // diamond
        // wildcard

        Racer<?> racer2 = new Racer<>("racer_name");
        Racer<? extends Car> racer3 = new Racer<>("racer_name");

        printHorsepower(taxiDriver);
        printHorsepower(racer);

        // A - подтип B
        // String[]  Object[]
        // CustomArray<A>  CustomArray<B>
    }

    public static <T extends Car> void printHorsepower(CarHolder<T> carHolder) {
        System.out.println(carHolder.getCar().getHorsepower());
    }
}
