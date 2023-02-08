package oop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    ParkingLot parkingLot = new ParkingLot(5);
    Car car = new Car();


    @Test
    public void itShouldAddCarsToTheParkingLot() {
        parkingLot.add(car);
        
        assertEquals(parkingLot.getCars().size(), 1);
    }

    @Test
    public void itShouldReturnTrueWhenCanAcceptCar() {
        boolean canAcceptCar = parkingLot.canAcceptCar();

        assertTrue(canAcceptCar);
    }

    @Test
    public void itShouldReturnFalseWhenCannotAcceptCar() {
        parkingLot.add(new Car());
        parkingLot.add(new Car());
        parkingLot.add(new Car());
        parkingLot.add(new Car());
        boolean canAcceptCar = parkingLot.canAcceptCar();

        assertFalse(canAcceptCar);
    }

    @Test
    public void itShouldReturnFalseWhenCarNotFound() {
        boolean hasCar = parkingLot.hasCar(car);

        assertFalse(hasCar);
    }

    @Test
    public void itShouldReturnTrueWhenCarFound() {
        parkingLot.add(car);

        boolean hasCar = parkingLot.hasCar(car);

        assertTrue(hasCar);
    }

    @Disabled
    @Test
    public void itShouldCheckCapacity() {
        boolean capacity = parkingLot.checkCapacity();

        assertTrue(capacity);
    }
}