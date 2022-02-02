package com.fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FibonacciEdgeCasesTest {
    private FibonacciIndex fibonacciIndex;

    @Before
    public void setUp() {
        fibonacciIndex = new FibonacciIndex();
    }

    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, fibonacciIndex.findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, fibonacciIndex.findIndexOf(-1));
    }
}
