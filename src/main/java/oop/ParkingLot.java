package oop;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Car> cars = new ArrayList<>();
    private Integer capacity = 50;

    public List<Car> getCars() {
        return cars;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public boolean checkCapacity() {
        return cars.size() < capacity;
    }
}
