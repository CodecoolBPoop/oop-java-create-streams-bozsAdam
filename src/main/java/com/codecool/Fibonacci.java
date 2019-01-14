package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private List<Integer> fibonacciSequence = new ArrayList<>();

    Fibonacci(Integer length){
        if(length == 1){
            fibonacciSequence.add(1);
        } else if(length == 2){
            fibonacciSequence.add(1);
            fibonacciSequence.add(1);
        } else if(length>2){
            fibonacciSequence.add(1);
            fibonacciSequence.add(1);
            for (int i = 1; i < length+1 ; i++) {
                fibonacciSequence.add(fibonacciSequence.get(i-1)+fibonacciSequence.get(i));
            }
        }
    }

    public List<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }
}
