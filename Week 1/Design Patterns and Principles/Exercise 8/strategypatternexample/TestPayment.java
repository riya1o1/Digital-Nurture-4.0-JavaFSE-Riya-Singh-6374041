package strategypatternexample;

public class TestPayment {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.payAmount(2500.00);

        System.out.println("--------------------------");

        // Use PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(3500.75);
    }
}
