package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack();
    
    @Test
    public void itShouldAddAnElementToTheStack() {
        stack.push(1);

        assertEquals(stack.size(), 1);
    }
    
    @Test
    public void itShouldReturnTheLastElementAndRemoveItFromStack() {
        stack.push(1);
        stack.push(2);

        assertEquals(stack.pop(), 2);
        assertEquals(stack.size(), 1);
    }

    @Test
    public void itShouldReturnTheLastElementAndNotRemoveItFromStack() {
        stack.push(1);
        stack.push(2);

        assertEquals(stack.peek(), 2);
        assertEquals(stack.size(), 2);
    }
}