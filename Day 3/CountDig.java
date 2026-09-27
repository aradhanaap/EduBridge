package day3;

public class CountDig {
	    static int countDigits(int n) {
	        if (n == 0) {
	            return 0; 
	        }

	        return 1 + countDigits(n / 10);
	    }

	    public static void main(String[] args) {

	        int n = 908172;

	        System.out.println("Number of digits in " + n + " = " + countDigits(n));
	    }
	}


