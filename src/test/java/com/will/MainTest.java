package com.will;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void getDivisionDoesCorrectMath() throws Exception {
        double expectedOutput = 0.5;
        assertEquals(expectedOutput, Main.getDivisionResult("5", "10"), 0);
    }
}
