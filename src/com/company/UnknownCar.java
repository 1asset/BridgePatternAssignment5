package com.company;

public class UnknownCar extends AbstractCar {
    public UnknownCar(Engine engine) {
        super(engine);
    }

    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }
}
