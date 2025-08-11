package org.example;

public class Student {
    String name;

    public static void changeStudentName(Student student, String newName) {
        student.name = newName; // modifies the same object
    }
}

