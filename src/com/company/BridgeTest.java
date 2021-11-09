package com.company;

public class BridgeTest {

    public static void main(String[] args) {
        AbstractCar sportAbstractCar = new SportCar(new SportEngine());
        sportAbstractCar.setEngine();
        System.out.println();
        AbstractCar unknownAbstractCar = new UnknownCar(new UnknownEngine());
        unknownAbstractCar.setEngine();
    }
}
