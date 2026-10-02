package day5;
class Contact {
    private String name;
    private String email;
    private String phone;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for email
    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email!");
        }
    }

    // Setter for phone
    public void setPhone(String phone) {
        if (phone.matches("\\d{10}")) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone number! Phone must contain exactly 10 digits.");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

public class Main {
    public static void main(String[] args) {

        Contact c = new Contact();

        c.setName("Aradhana");
        c.setEmail("aradhana@gmail.com");
        c.setPhone("9876543210");

        System.out.println("Name: " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Phone: " + c.getPhone());

        // Testing invalid data
        c.setEmail("aradhana@gmail");
        c.setPhone("98765");
    }
}
