package org.example;

public class ParameterPassing {
    public static void modifyValue(int value) {

        //result prediction: 50, 100, 50
        //actual result:  50, 100, 50
        value = 100;
        System.out.println("Inside method" + value);
    }
}
