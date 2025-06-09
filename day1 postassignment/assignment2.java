package post_assignment;

import java.util.Scanner;

public class assignment2 {
	
	// Recursive method to calculate sum of digits
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0; // base case
        } else {
            return (n % 10) + sumDigits(n / 10); // recursive step
        }
    }

	public static void main(String[] args) {
		
		
	    
	    Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Output result
        int result = sumDigits(number);
        System.out.println("Sum of digits = " + result);

	}

}
