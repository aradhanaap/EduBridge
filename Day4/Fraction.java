package day4;

class Fraction {
    int numerator;
    int denominator;

    // Constructor
    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        // Make denominator positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // Find GCD
        int gcd = findGCD(Math.abs(numerator), denominator);

        // Reduce fraction
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // Method to find GCD
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Add two fractions
    Fraction add(Fraction f) {
        int newNumerator =
            this.numerator * f.denominator +
            f.numerator * this.denominator;

        int newDenominator =
            this.denominator * f.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Display fraction
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 6);

        Fraction result = f1.add(f2);

        System.out.println("Fraction 1: " + f1);
        System.out.println("Fraction 2: " + f2);
        System.out.println("Sum: " + result);
    }
}
