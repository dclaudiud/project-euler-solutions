package solutions;

/**
 * Multiples of 3 or 5
 * Problem 1
 *
 * https://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public static void main(String[] args) {

        // the sum of all the multiples of 3 or 5
        int sum = 0;

        // Iterate through all the numbers
        for(int i = 0; i < 1000; i++){
            // check if the number can be divided by 3 or 5
            if(checkIfMultipleOf3Or5(i)){
                // add it to the sum
                sum += i;
            }
        }

        // print the sum
        System.out.println("The sum is: " + sum);
    }

    static boolean checkIfMultipleOf3Or5(int n){
        return n % 3 == 0 || n %5 == 0;
    }
}
