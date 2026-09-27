package day3;

public class Rectangle {

	

	    // Fields
	    int length;
	    int width;

	    // Constructor
	    Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Instance method to calculate area
	    int area() {
	        return length * width;
	    }

	    // Static method to check whether rectangle is a square
	    static boolean isSquare(int l, int w) {
	        return l == w;
	    }
	}

	public class Main{
	    public static void main(String[] args) {

	        // Create an object
	        Rectangle r = new Rectangle(10, 5);

	        // Call instance method
	        System.out.println("Area = " + r.area());

	        // Call static method
	        System.out.println("Is Square? " + Rectangle.isSquare(10, 5));
	    }
	}

