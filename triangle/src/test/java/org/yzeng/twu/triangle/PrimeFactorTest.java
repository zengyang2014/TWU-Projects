package org.yzeng.twu.triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Test for FizzBuzz
 */
public class PrimeFactorTest extends TestCase{
    public PrimeFactorTest(String testName) {
        super(testName);
    }
    public static Test suite() {
        return new TestSuite(PrimeFactorTest.class);
    }

    protected PrimeFactor primeFactor;

    public void testPrimeFactorWithSix() {
        primeFactor = new PrimeFactor(6);
        primeFactor.generatePrimeFactors();
        ArrayList<Integer> actualGet= primeFactor.getPrimeFactors();
        ArrayList<Integer> expectPrimefactors = new ArrayList<Integer>(){{
            add(2);
            add(3);
        }};

        assertEquals(expectPrimefactors, actualGet);
    }

    public void testPrimeFactorWithThirty() {
        primeFactor = new PrimeFactor(30);
        primeFactor.generatePrimeFactors();
        ArrayList<Integer> actualGet= primeFactor.getPrimeFactors();
        ArrayList<Integer> expectPrimefactors = new ArrayList<Integer>(){{
            add(2);
            add(3);
            add(5);
        }};

        assertEquals(expectPrimefactors, actualGet);
    }

    public void testPrimeFactorWithOne() {
        primeFactor = new PrimeFactor(1);
        primeFactor.generatePrimeFactors();
        ArrayList<Integer> actualGet= primeFactor.getPrimeFactors();
        ArrayList<Integer> expectPrimefactors = new ArrayList<Integer>();

        assertEquals(expectPrimefactors, actualGet);
    }
}
