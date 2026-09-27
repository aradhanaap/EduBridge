package day3;

public class Average{
	    static double average(double... nums) {
	        double sum = 0;

	        for (double num : nums) {
	            sum += num;
	        }

	        return sum / nums.length;
	    }

	    public static void main(String[] args) {

	        double result1 = average(4, 8, 6);
	        double result2 = average(10, 20);

	        System.out.println("Average of (4, 8, 6) = " + result1);
	        System.out.println("Average of (10, 20) = " + result2);
	    }
	}


