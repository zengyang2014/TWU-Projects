package org.yzeng.twu.triangle;
import java.util.ArrayList;

/**
 * Prime Factors Exercise of TWU
 */
public class PrimeFactor {
    private Integer number;
    private ArrayList<Integer> primeFactors;

    PrimeFactor(Integer number) {
        this.number = number;
        primeFactors = new ArrayList<Integer>();
    }

    public void generatePrimeFactors() {
        ArrayList<Integer> primes = findPrimes(number/2);
        if(number == 1) {
            return;
        }
        for(int i = 0; i < primes.size(); i++) {
            if(number % primes.get(i) == 0)
                primeFactors.add(primes.get(i));
        }
    }

    private ArrayList<Integer> findPrimes(Integer number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= number; i++) {
            boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                primes.add(i);
            }
        }
        return primes;
    }

    public ArrayList<Integer> getPrimeFactors() {
        return primeFactors;
    }
}
