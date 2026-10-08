interface Payment {
    void pay();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.pay();

        Payment p2 = new CardPayment();
        p2.pay();
    }
}