package Adapter;

public class PayPalAdapter implements PaymentProcessor{
    private final PayPalPaymentService payPalPaymentService;

    public PayPalAdapter(PayPalPaymentService payPalPaymentService){
        this.payPalPaymentService = payPalPaymentService;
    }
    public void processPayment(double amount){
        payPalPaymentService.pay(amount);
    }
}
