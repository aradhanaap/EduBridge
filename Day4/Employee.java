package day4;
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // Store 4 employees in an array
        Employee[] employees = {
            new Employee("Aradhana", 45000),
            new Employee("Rahul", 60000),
            new Employee("Priya", 55000),
            new Employee("Amit", 75000)
        };

        double totalSalary = 0;
        Employee highestPaid = employees[0];

        // Find highest salary and calculate total
        for (Employee e : employees) {
            totalSalary += e.salary;

            if (e.salary > highestPaid.salary) {
                highestPaid = e;
            }
        }

        // Calculate average salary
        double averageSalary = totalSalary / employees.length;

        System.out.println("Highest-Paid Employee:");
        System.out.println("Name: " + highestPaid.name);
        System.out.println("Salary: " + highestPaid.salary);

        System.out.printf("Average Salary: %.2f%n", averageSalary);
    }
}
