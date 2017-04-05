package org.yzeng.twu.triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    protected App app;

    protected void setUp() {
        app = new App();
    }

    public void testApp() {
        assertTrue(true);
    }

    public void testPrintOneAsterisk() {
        String given = "*";
        String when = app.printOneAsterisk();

        assertEquals(given, when);
    }

    public void testDrawHorizontalLine() {
        Integer givenNum = 8;
        String output = app.drawHorizontalLine(givenNum);

        assertTrue(output.equals("********"));
    }

    public void testDrawVerticalLine() {
        Integer givenNum = 3;
        String output = app.drawVerticalLine(givenNum);

        assertTrue(output.equals("*\n*\n*\n"));
    }

    public void testDrawRightTriangle() {
        Integer givenNum = 3;
        String output = app.drawRightTriangle(givenNum);

        assertTrue(output.equals("*\n**\n***\n"));
    }
}
