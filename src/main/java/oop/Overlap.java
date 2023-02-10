package oop;

import java.util.List;

public class Overlap {
    public int calculate(List<Integer> integerList1, List<Integer> integerList2) {
        int count = 0;
        for (Integer number : integerList1 ){
            for ( Integer number2: integerList2) {
                if(number.equals(number2)){
                    count++;
                }
            }
        }
        return count;
    }
}
