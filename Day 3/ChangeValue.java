package day3;

public class ChangeValue {

	
	    // Method for changing an integer
	    static void changeNum(int x) {
	        x = 100;
	    }

	    // Method for changing an array element
	    static void changeArr(int[] a) {
	        a[0] = 100;
	    }

	    public static void main(String[] args) {

	        int x = 10;
	        int[] a = {10};

	        System.out.println("Before:");
	        System.out.println("x = " + x);
	        System.out.println("a[0] = " + a[0]);

	        changeNum(x);
	        changeArr(a);

	        System.out.println("After:");
	        System.out.println("x = " + x);
	        System.out.println("a[0] = " + a[0]);
	    }
	}


