package org.yzeng.twu.triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

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

    public void testDrawCenteredTriangle() {
        Integer givenNum = 3;
        String output = app.drawCenteredTriangle(givenNum);

        assertTrue(output.equals("  *  \n *** \n*****\n"));
    }

    public void testDrawCenteredDiamondTriangle() {
        Integer givenNum = 3;
        String output = app.drawCenteredDiamondTriangle(givenNum);

        assertTrue(output.equals("  *  \n *** \n*****\n *** \n  *  \n"));
    }

    public void testDrawDiamondWithName() {
        Integer givenNum = 3;
        String givenName = "Bill";
        String output = app.drawDiamondWithName(givenNum,  givenName);
        System.out.println(output);
        assertTrue(output.equals(" * \n***\nBill\n***\n * \n"));
    }
}
