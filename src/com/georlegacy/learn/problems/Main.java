package com.georlegacy.learn.problems;

/*
 * Listing all even Fibonacci terms below 4000000 and finding the sum of them
 *
 *  @author James Conway
 */


public class Main {

    public static void main(String[] args) {
        // Declare 3 current terms that the system is using
        int n1 = 0, n2 = 1, n3 = 0;

        // Declare an integer to store the sum of all Fibonacci terms below 4000000
        int total = 0;

        // Loop through finding Fibonacci terms until reaching 4000000
        while (n3 <= 4000000) {
            // Total n1 and n2 to form n3
            n3 = n1 + n2;

            // Reassign n1 and n2 to continue sequence
            n1 = n2;
            n2 = n3;

            // Check if n3 is even with modulus operator
            if (n3 % 2 == 0) {
                // Add to the total
                total += n3;
            }
        }

        System.out.printf("The sum of all even Fibonacci terms below 4000000 is %s", total);
    }

}
