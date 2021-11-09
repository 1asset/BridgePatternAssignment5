package com.company;

abstract class AbstractCar {
    protected Engine engine;

    public AbstractCar(Engine engine) {
        this.engine = engine;
    }

    abstract public void setEngine();
}
