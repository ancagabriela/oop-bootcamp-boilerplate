package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssistantTest {

    @Test
    public void itShouldParkTheCar() {
        Car car = new Car();
        Assistant assistant= new Assistant();
        assistant.park(car);

        assertTrue(car.isParked());
    }

    @Test
    public void itShouldRetrieveTheCar() {
        Car car = new Car();
        Assistant assistant= new Assistant();
        assistant.retrieve(car);

        assertFalse(car.isParked());
    }
}
