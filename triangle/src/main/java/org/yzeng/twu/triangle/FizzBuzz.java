package org.yzeng.twu.triangle;

/**
 * FizzBuzz Exercise of TWU
 */
public class FizzBuzz {
    private Integer fizz;
    private Integer buzz;
    private static final Integer MAX_NUM = 100;
    private static final Integer START_NUM = 1;
    FizzBuzz() {
        this.fizz = 3;
        this.buzz = 5;
    }

    public String playGame() {
        String output = "";
        for(int i = START_NUM; i <= MAX_NUM; i++) {
            if(i % fizz == 0 && i % buzz == 0) {
                output += "FizzBuzz\n";
            }
            else if(i % fizz == 0 && i % buzz != 0) {
                output += "Fizz\n";
            }
            else if(i % fizz != 0 && i % buzz == 0) {
                output += "Buzz\n";
            }
            else {
                output = output + i + "\n";
            }
        }
        return output;
    }

    public void setBuzz(Integer buzz) {
        this.buzz = buzz;
    }

    public void setFizz(Integer fizz) {
        this.fizz = fizz;
    }
}
