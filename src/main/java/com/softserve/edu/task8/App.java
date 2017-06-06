package com.softserve.edu.task8;

import com.softserve.edu.task8.math.Fibonacci;

/**
 * entry point
 */
public class App {
    public static void main(String[] args) {
        try {
            Fibonacci fibonacci = new Fibonacci(args);
            fibonacci.printRangeFibonacci();
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
}
