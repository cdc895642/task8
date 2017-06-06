package com.softserve.edu.task8.math;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by cdc89 on 06.06.2017.
 */
public class FibonacciTest {
    @Test(expected = IllegalArgumentException.class)
    public void Fibonacci_NotCorrectCountArgs_ThrowIllegalArgumentException() {
        //Arrange
        String[] args = new String[]{"3"};

        //Act
        Fibonacci fibonacci = new Fibonacci(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Fibonacci_NoDigitInput_ThrowIllegalArgumentException() {
        //Arrange
        String[] args = new String[]{"a3", "1"};

        //Act
        Fibonacci fibonacci = new Fibonacci(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    Fibonacci_StartArgBiggerThanFinish_ThrowIllegalArgumentException() {
        //Arrange
        String[] args = new String[]{"3", "1"};

        //Act
        Fibonacci fibonacci = new Fibonacci(args);
    }

    @Test
    public void printRangeFibonacci_ArgsEqual_PrintOneValue() {
        //Arrange
        String[] args = new String[]{"3", "3"};
        final String EXPECTED = "1";
        Fibonacci fibonacci = new Fibonacci(args);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        fibonacci.setOut(new PrintStream(outContent));

        //Act
        fibonacci.printRangeFibonacci();

        //Assert
        assertEquals(EXPECTED, outContent.toString());
    }

    @Test
    public void printRangeFibonacci_Start3Finish5_PrintValues() {
        //Arrange
        String[] args = new String[]{"3", "5"};
        final String EXPECTED = "1, 2, 3";
        Fibonacci fibonacci = new Fibonacci(args);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        fibonacci.setOut(new PrintStream(outContent));

        //Act
        fibonacci.printRangeFibonacci();

        //Assert
        assertEquals(EXPECTED, outContent.toString());
    }
}
