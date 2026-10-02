package day4;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);

        System.out.printf("Area = %.2f%n", c.area());
        System.out.printf("Circumference = %.2f%n", c.circumference());
    }
}
