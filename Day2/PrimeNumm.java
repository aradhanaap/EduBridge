package day2;

public class PrimeNumm {

	
		 static boolean isPrime(int n) {
		        if (n < 2) {
		            return false;
		        }

		        for (int i = 2; i <= n / 2; i++) {
		            if (n % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }

		    public static void main(String[] args) {

		        // Check numbers from 1 to 50
		        for (int i = 1; i <= 50; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		            }
		        }
		    }
		

	}


