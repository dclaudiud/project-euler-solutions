package solutions;

/**
 * Largest prime factor
 * Problem 3
 *
 * https://projecteuler.net/problem=3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {
        long number = 600851475149L;
        long largestPrimeFactor = -1;

        // check each number in the range 0 - number
        for(long l = 2; l <= number; l++){
            // check if the iterator is prime, and if the number can be divided by the iterator
            if(isPrime(l) && number % l == 0){
                // the iterator can be considered the largest prime factor
                largestPrimeFactor = l;
                // divide the number by the largest prime factor until it becomes 1
                number /= l;
            }
        }

        // print the largest prime factor
        System.out.println(largestPrimeFactor == -1 || number != 1 ?
                "No prime factor could be found!"
                :
                "The largest prime factor is: " + largestPrimeFactor);
    }

    // check if the number is prime - O(n)
    static boolean isPrime(long l){
        for(long k = 2; k < Math.sqrt(l); k++){
            if(l % k == 0){
                return false;
            }
        }
        return true;
    }
}
