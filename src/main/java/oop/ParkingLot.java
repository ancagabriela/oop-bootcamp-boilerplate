package oop;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private final double ACCEPTABLE_CAPACITY = 0.8;
    private List<Car> cars = new ArrayList<>();
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public boolean checkCapacity() {
        return cars.size() < capacity;
    }

    public boolean canAcceptCar() {
        return cars.size() < capacity * ACCEPTABLE_CAPACITY;
    }

    public boolean hasCar(Car car) {
        return cars.contains(car);
    }
}
