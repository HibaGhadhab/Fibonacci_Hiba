package src.main.java.eu.ensg.hiba.fibonacci.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class SuiteFibonnaciTest {

    //test fibonacci sequence with zero
    @Test
    public void fiboWithZero()
    {
        assertEquals(0,SuiteFibonnaci.fibo(0));
    }

    //test fibonacci sequence with negative numbers
    @Test
    public void fiboWithNegative()
    {
        assertEquals(0, SuiteFibonnaci.fibo(-1));
        assertEquals(0, SuiteFibonnaci.fibo(-12));
        assertEquals(0, SuiteFibonnaci.fibo(Long.MIN_VALUE));
    }

    //test fibonacci sequence with one
    @Test
    public void fiboWithOne()
    {
        assertEquals(1, SuiteFibonnaci.fibo(1));
    }

    //test fibonacci sequence with other any positive number
    @Test
    public void fiboWithStrictPositive()
    {
        //correct case
        assertEquals(233, SuiteFibonnaci.fibo(13));
        assertEquals(13, SuiteFibonnaci.fibo(7));

        //incorrect case
        //assertEquals(125, SuiteFibonnaci.fibo(13));
    }

    //IC: faux test à tester avec Azure DevOps Pipeline
    @Test
    public void fiboIC()
    {
        assertEquals(23,SuiteFibonnaci.fibo(0));
    }
}
