abstract class Payment {
    protected double amount;

    // Im using Constructor here to initialize the amount for payment, which is a common attribute for all types of payments.
    Payment(double amount) {
        this.amount = amount;
    }

    // Im using Abstract method (Abstraction)
    abstract void pay();
}

// Im using Inheritance + Polymorphism
class CardPayment extends Payment {
    private String cardNumber; // Encapsulation

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing Card Payment...");
        System.out.println("Amount Paid: Rs " + amount);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Payment Successful via Card");
    }
}

class UPIPayment extends Payment {
    private String upiId; // Encapsulation

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI Payment...");
        System.out.println("Amount Paid: Rs " + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Successful via UPI");
    }
}

public class OnlinePaymentGateway {
    public static void main(String[] args) {

        // Object creation
        Payment p1 = new CardPayment(5000, "1234567812345678");
        Payment p2 = new UPIPayment(1500, "barath@upi");

        // Polymorphism
        p1.pay();

        System.out.println("------------------");

        p2.pay();
    }
}