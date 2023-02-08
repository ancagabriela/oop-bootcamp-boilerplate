package oop;

public class Car {

    private boolean isParked;

    public void park() {
        isParked = true;
    }

    public void retrieve() {
        isParked = false;
    }

    public boolean isParked() {
        return isParked;
    }
}
