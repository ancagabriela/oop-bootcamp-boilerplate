package oop;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertEquals;

public class AssistantTest {

    Assistant assistant;// = new Assistant();
    Car car = new Car();

    @Test
    public void itShouldParkCarInLotAWhenLotAHasCapacity() {
        ParkingLot lotA = new ParkingLot(5);
        ParkingLot lotB = new ParkingLot(10);
        assistant = new Assistant(Arrays.asList(lotA, lotB));

        assistant.park(car);

        assertTrue(assistant.getLotA().hasCar(car));
    }

    @Test
    public void itShouldParkCarInLotBWhenLotBHasCapacityAndLotADoesNot() {
        ParkingLot lotA = new ParkingLot(5);
        ParkingLot lotB = new ParkingLot(10);
        assistant = new Assistant(Arrays.asList(lotA, lotB));
        assistant.getLotA().add(new Car());
        assistant.getLotA().add(new Car());
        assistant.getLotA().add(new Car());
        assistant.getLotA().add(new Car());
        assistant.getLotA().add(new Car());

        assistant.park(car);

        assertTrue(assistant.getLotB().hasCar(car));
    }


//    @Test
//    public void itShouldRetrieveTheCar() {
//        Car car = new Car();
//        Assistant assistant = new Assistant();
//        assistant.retrieve(car);
//
//        assertFalse(car.isParked());
//    }
}
