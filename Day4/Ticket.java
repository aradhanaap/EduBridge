package day4;

class Ticket {
    private static int counter = 101;

    private String ticketId;
    private String passengerName;

    // Constructor
    Ticket(String passengerName) {
        this.ticketId = "T" + counter++;
        this.passengerName = passengerName;
    }

    // Display ticket details
    void display() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println();
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket("Aradhana");
        Ticket t2 = new Ticket("Rahul");
        Ticket t3 = new Ticket("Priya");

        t1.display();
        t2.display();
        t3.display();
    }
}
