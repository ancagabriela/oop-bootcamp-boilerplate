package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car = new Car();

    @Test
    public void itShouldSetIsParkedToTrue() {
        car.park();

        assertTrue(car.isParked());
    }

    @Test
    public void itShouldSetIsParkedToFalse() {
        car.retrieve();

        assertFalse(car.isParked());
    }
}