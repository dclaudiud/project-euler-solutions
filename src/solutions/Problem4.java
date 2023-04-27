package solutions;

/**
 * Largest palindrome product
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        int largestPalindrome = 0;

        // iterate through all 3-digit numbers
        for(int i = 999; i >= 100; i--){
            for(int j = 999; j >= 100; j--){
                // if the number is a palindrome and is larger than the largest palindrome we have discovered
                if(isPalindrome(i * j) && i * j > largestPalindrome){
                    // store it
                    largestPalindrome = i * j;
                }
            }
        }

        // print the largest palindrome
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " +
                largestPalindrome);
    }

    // check if the number is a palindrome
    static boolean isPalindrome(int n){

        if(n < 10) return true;

        int m = n;
        int p = 0;

        while(m > 0){
            p = p * 10 + m % 10;
            m /= 10;
        }

        return n == p;
    }
}
