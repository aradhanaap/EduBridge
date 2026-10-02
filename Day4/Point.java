package day4;

class Point {
    double x, y;

    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    double distanceTo(Point other) {
        return Math.sqrt(
            Math.pow(other.x - x, 2) +
            Math.pow(other.y - y, 2)
        );
    }

    
    Point midpoint(Point other) {
        return new Point(
            (x + other.x) / 2,
            (y + other.y) / 2
        );
    }

  
    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(8, 7);

        System.out.println("Distance: " + p1.distanceTo(p2));

        Point mid = p1.midpoint(p2);
        System.out.print("Midpoint: ");
        mid.display();
    }
}
