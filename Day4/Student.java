package day4;

class Student {
    String name;
    int marks;

    // No-argument constructor
    Student() {
        name = "Unknown";
        marks = 0;
    }

    // Parameterized constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        // Object using no-argument constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student("Aradhana", 85);

        // Display details
        s1.display();
        s2.display();
    }
}