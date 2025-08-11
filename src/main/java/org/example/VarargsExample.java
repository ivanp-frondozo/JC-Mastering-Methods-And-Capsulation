package org.example;

import java.util.Arrays;

public class VarargsExample {

    public static void printMessages(String... messages) {

        //result prediction: Number of messages: 2 Hello World \n Number of messages: 3Testing Varargs Here \n Number of messages: 0
        //actual result: Number of messages: 2 Hello World \n Number of messages: 3Testing Varargs Here \n Number of messages: 0 \n
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.println(msg + " ");
        }
        System.out.println("\n");
    }

    public static void findLargest(int... numbers) {
        if (numbers.length == 0) {
            System.out.println(Integer.MIN_VALUE);
        }

        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest in: " + Arrays.toString(numbers) + " is: " + max );
    }
}
