package practice;
	
	import java.util.Scanner;

	/*public class task3 {
		
		public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // base case
	        } else {
	            return n * factorial(n - 1); // recursive call
	        }
	    }

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int num = s.nextInt();
	        System.out.println("Factorial of " + num + " is: " + factorial(num));
			

		}

	}		*/


	public class task3
	{
		public static int fibonacci(int n) {
	        if (n == 0) {
	            return 0; // base case
	        } else if (n == 1) {
	            return 1; // base case
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
	        }
	    }

	    public static void main(String[] args) {
	        int terms = 6; // number of terms to print
	        System.out.print("Fibonacci Series: ");
	        for (int i = 0; i < terms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
	}


