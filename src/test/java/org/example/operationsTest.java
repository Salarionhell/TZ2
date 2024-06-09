package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import java.io.IOException;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class operationsTest {
    @Before
    public void programExceptionFirst() throws NumberFormatException {
        Throwable thrown = assertThrows(NumberFormatException.class, () -> {
            Operations.readNumbers("fileWrong.txt");
        });
        assertNotNull(thrown.getMessage());

    }
    @Before
    public void programExceptionSecond() throws IOException {
        Throwable thrown = assertThrows(IOException.class, () -> {
            Operations.readNumbers("empty.txt");
        });
        assertNotNull(thrown.getMessage());

    }

    @Test
    public void testMin(){
        int[] numbers = {5, 7, 15, 2, 36};
        assertEquals(2, Operations.min(numbers));
    }
    @Test
    public void testMax(){
        int[] numbers = {7, 8, 10, 6, 5};
        assertEquals(10, Operations.max(numbers));
    }
    @Test
    public void testSum(){
        int[] numbers = {5, 10, 6, 8, 9};
        assertEquals(BigInteger.valueOf(38), Operations.sum(numbers));
    }
    @Test
    public void testMult(){
        int[] numbers = {2, 1, 3, 4, 6};
        assertEquals(BigInteger.valueOf(144), Operations.mult(numbers));
    }
    
}
