package main.VW4.Prime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.VW4.Prime.Prime.isPrime;

public class PrimeTest {

    @Test
    public void TestIsPrime() {
        assert isPrime(5);
        assert !isPrime(-1);
        assert !isPrime(0);
        assert !isPrime(6);
    }

    @Test
    public void IsPrimeTest() {
        int[] primeNumbers = new int[] {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71
        };

        Prime.isPrimeTest(primeNumbers);
    }

    @Test
    public void isPrimeNumbersFast() {
        Assertions.assertFalse(Prime.isPrimeFast(new int[]{2, 3, 5, 7, 11, 0, 0}, 5, 9));
        Assertions.assertTrue(Prime.isPrimeFast(new int[]{2, 3, 5, 7, 11, 0, 0}, 5, 19));
    }

    @Test
    public void PrimesFast() {
        int[] primes = Prime.primesFast(1000000);
        for (int foundPrime: primes) {
            Assertions.assertTrue(isPrime(foundPrime));
        }
    }

    @Test
    public void TestRuntimePrimesFast() {
        System.out.println(run(1000000));
    }

    long run(int n) {
        final long timeStart = System.currentTimeMillis();
        Prime.primesFast(n);
        final long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
}