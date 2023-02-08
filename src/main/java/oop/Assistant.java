package oop;

public class Assistant {
    public boolean park(Car car) {
        car.park();

        return car.isParked();
    }

    public boolean retrieve(Car car) {
        car.retrieve();
        return car.isParked();
    }
}
