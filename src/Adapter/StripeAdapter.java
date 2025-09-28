package Adapter;

public class StripeAdapter implements PaymentProcessor {
    private final StripePaymentService stripeService;

    public StripeAdapter(StripePaymentService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(double amount) {
        stripeService.charge(amount);
    }
}
