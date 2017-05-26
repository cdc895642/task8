package com.softserve.edu.task8.math;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by cdc89 on 26.05.2017.
 * find and print Fibonacci numbers
 */
public class Fibonacci {
    private int start;
    private int finish;

    public Fibonacci(String[] args) {
        parseArgs(args);
    }

    /**
     * print Fibonacci numbers in given range
     */
    public void printRangeFibonacci() {
        BigInteger before = BigInteger.valueOf(0);
        BigInteger current = BigInteger.valueOf(1);
        BigInteger next = BigInteger.valueOf(1);
        for (int i = 2; i <= finish; i++) {
            next = current.add(before);
            before = current;
            current = next;

            if (i >= start && i <= finish) {
                String delimiter = i == finish ? "" : ", ";
                System.out.print(before + delimiter);
            }
        }
    }

    private void parseArgs(String[] args) {
        final int START_NUM_INDEX = 0;
        final int END_NUM_INDEX = 1;
        if (args.length < 2) {
            throw new IllegalArgumentException("Wrong input parameters. Please insert start and " +
                    "end " +
                    "integer values for print Fibonacci numbers in given range.");
        }
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        try {
            start = numberFormat.parse(args[START_NUM_INDEX]).intValue();
            finish = numberFormat.parse(args[END_NUM_INDEX]).intValue();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Inserted incorrect value. Please insert positive " +
                    "integer value !");
        }
    }
}
