package day2;

public class Area {

	 // Area of square
    static int area(int side) {
        return side * side;
    }

    // Area of rectangle
    static int area(int l, int w) {
        return l * w;
    }

    // Area of circle
    static double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {

        int squareArea = area(4);
        int rectangleArea = area(4, 6);
        double circleArea = area(2.0);

        System.out.println("Area of Square = " + squareArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
        System.out.println("Area of Circle = " + circleArea);
    }

}
