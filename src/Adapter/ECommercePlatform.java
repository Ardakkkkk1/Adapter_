package Adapter;

public class ECommercePlatform {
    private final PaymentProcessor paymentProcessor;

    public ECommercePlatform(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double orderAmount) {
        paymentProcessor.processPayment(orderAmount);
    }
}
