package main.VW4.Prime;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Prime {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeTest(int[] primeNumbers) {
        return Arrays.stream(primeNumbers).allMatch(Prime::isPrime);
    }

    public static boolean isPrimeFast(int[] primes, int n, int number) {
        if (n == 0 || primes.length == 0) {
            return true;
        }


        for (int i = 0; i < n; i++) {
            if (number % primes[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] primesFast(int n) {
        if (n < 2)
            return new int[0];

        int[] foundPrimes = new int[0];
        for (int i = 2; i < n; i++) {
            if (isPrimeFast(foundPrimes, foundPrimes.length, i)) {
                foundPrimes = Arrays.copyOf(foundPrimes, foundPrimes.length + 1);
                foundPrimes[foundPrimes.length-1] = i;
            }
        }

        return foundPrimes;
    }
}
