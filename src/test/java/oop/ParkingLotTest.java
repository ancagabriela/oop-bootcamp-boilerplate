package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    ParkingLot parkingLot = new ParkingLot();
    Car car = new Car();

    @Test
    public void itShouldAddCarsToTheParkingLot() {
        parkingLot.add(car);
        
        assertEquals(parkingLot.getCars().size(), 1);
    }

    @Test
    public void itShouldCheckCapacity() {
        boolean capacity = parkingLot.checkCapacity();

        assertTrue(capacity);
    }
}