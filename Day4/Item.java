package day4;

class Item {
    String name;
    double price;
    int qty;

    // Constructor
    Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Calculate item total
    double getItemTotal() {
        return price * qty;
    }
}

class Cart {
    Item[] items = new Item[10];
    int count = 0;

    // Add an item to the cart
    void addItem(Item item) {
        if (count < 10) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Calculate total cart price
    double getTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += items[i].getItemTotal();
        }

        return total;
    }

    // Print bill
    void printBill() {
        System.out.println("----- BILL -----");

        for (int i = 0; i < count; i++) {
            System.out.printf("%s - %.2f x %d = %.2f%n",
                    items[i].name,
                    items[i].price,
                    items[i].qty,
                    items[i].getItemTotal());
        }

        System.out.println("----------------");
        System.out.printf("Total = %.2f%n", getTotal());
    }

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem(new Item("Pen", 10.00, 2));
        cart.addItem(new Item("Notebook", 50.00, 3));
        cart.addItem(new Item("Pencil", 5.00, 4));

        cart.printBill();
    }
}