package day4;

class Counter {
    private int count;

    // Increment count
    void increment() {
        count++;
    }

    // Decrement count, but never below 0
    void decrement() {
        if (count > 0) {
            count--;
        }
    }

    // Reset count to 0
    void reset() {
        count = 0;
    }

    // Return current count
    int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();

        System.out.println("Count after increment: " + c.getCount());

        c.decrement();
        System.out.println("Count after decrement: " + c.getCount());

        c.reset();
        System.out.println("Count after reset: " + c.getCount());

        // Testing that count never goes below 0
        c.decrement();
        System.out.println("Count after decrement below 0: " + c.getCount());
    }
}
