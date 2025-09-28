package Adapter;

public class StripePaymentService {
    public void charge(double value) {
        System.out.println("Charging $" + value + " with Stripe");
    }
}
