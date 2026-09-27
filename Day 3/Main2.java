package day3;

public class Main2 {

	

	    // Recursive method to find sum of 1 + 2 + ... + n
	    static int sum(int n) {

	        // Base case
	        if (n == 1) {
	            return 1;
	        }

	        // Recursive case
	        return n + sum(n - 1);
	    }

	    public static void main(String[] args) {

	        int n = 10;

	        System.out.println("Sum of 1 to " + n + " = " + sum(n));
	    }
	}

