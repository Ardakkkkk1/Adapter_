package Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new StripeAdapter(new StripePaymentService());
        ECommercePlatform shop = new ECommercePlatform(paymentProcessor);
        shop.checkout(149.99);
    }
}
