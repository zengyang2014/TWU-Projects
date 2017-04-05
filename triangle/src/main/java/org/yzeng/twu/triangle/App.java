package org.yzeng.twu.triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.drawHorizontalLine(8));
        System.out.println(app.drawVerticalLine(8));
        System.out.println(app.drawRightTriangle(3));
    }

    public String printOneAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(Integer givenNum) {
        String asterisks = "";
        for(int i = 0; i < givenNum; i++) {
            asterisks += "*";
        }
        return asterisks;
    }

    public String drawVerticalLine(Integer givenNum) {
        String asterisks = "";
        for(int i = 0; i < givenNum; i++) {
            asterisks +="*\n";
        }

        return asterisks;
    }

    public String drawRightTriangle(Integer givenNum) {
        String asterisks = "";
        for (int i = 1; i <= givenNum; i++) {
            asterisks = asterisks + drawHorizontalLine(i) + "\n";
        }

        return asterisks;
    }
}
