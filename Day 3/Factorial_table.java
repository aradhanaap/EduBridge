package day3;

public class Factorial_table{
	    static int factorial(int n) {

	        
	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        
	        return n * factorial(n - 1);
	    }

	    public static void main(String[] args) {

	        
	        for (int i = 1; i <= 6; i++) {
	            System.out.println(i + "!" + "="  + factorial(i));
	        }
	    }
	}

	


