package oop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OverlapTest {
    
    @Test
    public void itShouldCalculateOverlapBetweenTwoArrays() {
        Overlap overlap = new Overlap();

        int actual = overlap.calculate(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));

        assertEquals(3, actual);
    }

    @Test
    public void itShouldCalculateOverlapBetweenTwoArrays2() {
        Overlap overlap = new Overlap();

        int actual = overlap.calculate(Arrays.asList(1, 2, 4, 5), Arrays.asList(1, 2, 3, 6));

        assertEquals(2, actual);
    }

}