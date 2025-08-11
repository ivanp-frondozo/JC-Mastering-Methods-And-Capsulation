package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void lockDoor() {
        isLocked = false;
        System.out.println("Is the door locked?" + isLocked);
        System.out.println("Locking the door...");
    }

    public void unlockDoor() {
        isLocked = true;
        System.out.println("Is the door locked?" + isLocked);
        System.out.println("Unlocking the door...");
    }

    public boolean isLocked() {
        return isLocked;
    }
}
