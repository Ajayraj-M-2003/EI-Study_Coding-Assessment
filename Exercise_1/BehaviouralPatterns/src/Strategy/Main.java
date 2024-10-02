package Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100.0);

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(150.0);

        // Switch to Cryptocurrency
        context.setPaymentStrategy(new CryptoPayment());
        context.executePayment(200.0);
    }
}