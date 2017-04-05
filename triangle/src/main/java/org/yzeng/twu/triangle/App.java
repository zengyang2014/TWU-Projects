package org.yzeng.twu.triangle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
//        System.out.println(app.drawHorizontalLine(8));
//        System.out.println(app.drawVerticalLine(8));
        System.out.println(app.drawCenteredDiamondTriangle(5));
        System.out.println(app.drawDiamondWithName(4, "Bill"));
    }

    public String printOneAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(Integer givenNum) {
        String asterisks = "";
        for (int i = 0; i < givenNum; i++) {
            asterisks += "*";
        }
        return asterisks;
    }

    public String drawVerticalLine(Integer givenNum) {
        String asterisks = "";
        for (int i = 0; i < givenNum; i++) {
            asterisks += "*\n";
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

    public String drawCenteredTriangle(Integer givenNum) {
        String asterisks = "";
        for (int i = 0; i < givenNum; i++) {
            asterisks += generateOneRow(givenNum, i);
        }

        return asterisks;
    }

    private String generateOneRow(Integer givenNum, int currentRow) {
        return createSpace(givenNum - 1 - currentRow) +
                drawHorizontalLine(2 * currentRow + 1) + createSpace(givenNum - 1 - currentRow) + "\n";
    }

    private String createSpace(int num) {
        String spaces = "";
        for (int i = 0; i < num; i++) {
            spaces += " ";
        }
        return spaces;
    }

    public String drawCenteredDiamondTriangle(Integer givenNum) {
        String asterisks = "";
        for (int i = 0; i < givenNum; i++) {
            asterisks += generateOneRow(givenNum, i);
        }
        for (int i = 0; i < givenNum - 1; i++) {
            asterisks += generateOneRow(givenNum, givenNum - 2 - i);
        }
        return asterisks;
    }

    private String drawRevertTriangle(Integer givenNum) {
        String asterisks = "";
        for (int i = givenNum; i > 0; i--) {
            asterisks += generateOneRow(givenNum, i - 1);
        }
        return asterisks;
    }

    public String drawDiamondWithName(Integer givenNum, String givenName) {
        String diamond = "";
        diamond += drawCenteredTriangle(givenNum - 1);
        diamond += givenName + "\n";
        diamond += drawRevertTriangle(givenNum - 1);

        return diamond;
    }
}
