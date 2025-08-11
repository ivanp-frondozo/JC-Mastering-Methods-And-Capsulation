package org.example;

public class Car {


    //result prediction: Engine has started. The car is moving at 60 mph.
    //actual result: Engine has started. The car is moving at 60 mph.
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine() {
        System.out.println("Engine has been turned off.");
    }

}