package day5;

class Wallet {
    private double balance;

    // Constructor
    Wallet(double balance) {
        this.balance = balance;
    }

    // Add money to wallet
    void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money added: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Pay money from wallet
    void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (amount > balance) {
            System.out.println("Payment failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Payment successful: " + amount);
        }
    }

    // Get current balance
    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000);

        System.out.println("Initial Balance: " + wallet.getBalance());

        wallet.addMoney(500);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.pay(300);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.pay(1500);
        System.out.println("Balance: " + wallet.getBalance());
    }
}