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
        System.out.println(app.printOneAsterisk());
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
}
