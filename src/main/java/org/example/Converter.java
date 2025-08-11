package org.example;

public class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static float celsiusToFahrenheit(float fahrenheit) {
        return (float) ((fahrenheit -32) * 5.0/9.0);
    }
}
