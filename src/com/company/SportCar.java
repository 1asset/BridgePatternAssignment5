package com.company;

public class SportCar extends AbstractCar {
    public SportCar(Engine engine) {
        super(engine);
    }

    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }
}
