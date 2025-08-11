package org.example;

import java.util.Arrays;

import static org.example.Converter.celsiusToFahrenheit;

public class Main {
    public static void main(String[] args) {
        //question 1
//        Car myCar = new Car();
//        myCar.startEngine();
//        String status = myCar.drive(60);
//        System.out.println(status);
//        myCar.turnOffEngine();

        //question 2
//        ParameterPassing parameterPassing = new ParameterPassing();
//        int originalValue = 50;
//        System.out.println("Before method call: " + originalValue);
//        parameterPassing.modifyValue(originalValue);
//        System.out.println("After method call: " + originalValue);

        //question 2: mini challenge
//        Student student = new Student();
//        student.name = "Alice";
//
//        System.out.println("Before: " + student.name);
//        Student.changeStudentName(student, "Jordan");
//        System.out.println("After: " + student.name);

        //question 3
//        VarargsExample varargsExample = new VarargsExample();
//        varargsExample.printMessages("Hello", "World");
//        varargsExample.printMessages("Testing", "Varags", "Here");
//        varargsExample.printMessages();

        //question 3 mini challenge
//        varargsExample.findLargest(10, 5, 25, 15);
//        varargsExample.findLargest(-5, -1, -10);
//        varargsExample.findLargest();

        //question 4
//        Account myAccount = new Account();
//        myAccount.displayAccountDetails();

        //question 4 mini challenge
//        SmartDoor smartDoor = new SmartDoor();
//        smartDoor.lockDoor();
//        smartDoor.unlockDoor();

        //question 5
//        System.out.println("App Name: " + Utility.getAppleName());
//
//        Utility utilInstance = new Utility();
//        System.out.println("Instance ID: " + utilInstance.getInstanceId());

//        System.out.println(25.0 + " degrees C is " + celsiusToFahrenheit(25.0) + " degrees F.");

        //question 6
//        Display d = new Display();
//        d.show(42);
//        d.show("Hello");
//        d.show("Goodbye", 3);

        //question 6 mini game
//        System.out.println(25.0 + " degrees C is " + celsiusToFahrenheit(25.0) + " degrees F.");
//        System.out.println(77.0 + " degrees Fis " + celsiusToFahrenheit(77.0) + " degrees C.");

        //question 7
//        Pizza pizza1 = new Pizza();
//        pizza1.display();
//
//        Pizza pizza2 = new Pizza("Pepperoni");
//        pizza2.display();
//
//        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//        pizza3.display();

        //question 7: mini challenge

//        Computer computer1 = new Computer();
//        Computer computer2 = new Computer("Dell");
//        Computer computer3 = new Computer("Apple", 16);
//
//        System.out.print("Computer 1: ");
//        computer1.display();
//
//        System.out.print("Computer 2: ");
//        computer2.display();
//
//        System.out.print("Computer 3: ");
//        computer3.display();

        //question 8
//        Thermostat stat = new Thermostat(22.5);
//        System.out.println("Initial temp: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
//        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(25.0); // Set a valid temp
//        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());

        //question 8 mini lab

        User user = new User("password123");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("Attempting to set short password 'pass'...");
        user.setPassword("pass");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("Attempting to set valid password 'secure_password_123'...");
        user.setPassword("secure_password_123");
        System.out.println("Current masked password: " + user.getPassword());




    }
}
