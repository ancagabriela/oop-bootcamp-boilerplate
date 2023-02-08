package oop;

import java.util.ArrayList;
import java.util.List;

public class Assistant {

    private ParkingLot lotA = new ParkingLot(5);
    private ParkingLot lotB = new ParkingLot(10);

    private List<ParkingLot> parkingLots = new ArrayList<>();

    public Assistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void park(Car car) {
        // loop through lots
        if (lotA.canAcceptCar()) {
            lotA.add(car);
        }
        if (lotB.canAcceptCar()) {
            lotB.add(car);
        }

    }

    public boolean retrieve(Car car) {
        car.retrieve();
        return car.isParked();
    }

    public ParkingLot getLotA() {
        return lotA;
    }

    public ParkingLot getLotB() {
        return lotB;
    }
}
