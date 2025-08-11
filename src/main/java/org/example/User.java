package org.example;

public class User {

    private String password;

    public User(String password) {
        setPassword(password);
    }

    public String getPassword() {
        if (password == null) return "";
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
        } else {
            this.password = password;
        }

    }
}
