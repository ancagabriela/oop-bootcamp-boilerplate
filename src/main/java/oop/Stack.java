package oop;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> integerList = new ArrayList<>();

    public void push(int i) {
        integerList.add(i);
    }

    public int size() {
        return integerList.size();
    }

    public int pop() {
        return integerList.remove(getLastIndex());
    }

    public int peek() {
        return integerList.get(getLastIndex());
    }

    private int getLastIndex() {
        return integerList.size() - 1;
    }
}
