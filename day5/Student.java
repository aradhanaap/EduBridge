package day5;

class Student {
    // Private final roll number - can be set only once
    private final int rollNumber;

    // Name can be changed
    private String name;

    // Constructor
    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Aradhana");

        System.out.println("Roll Number: " + s.getRollNumber());
        System.out.println("Name: " + s.getName());

        // Changing the name
        s.setName("Priya");

        System.out.println("Updated Name: " + s.getName());
    }
}