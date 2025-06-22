package adapterpatternexample;

public class TestPayment {
    public static void main(String[] args) {
        // PayPal Payment
        PaymentProcessor paypal = new GooglePayAdapter(new GooglePayGateway());
        paypal.processPayment(500.0);

        System.out.println("----------------------------");

        // Stripe Payment
        PaymentProcessor stripe = new PhonepeAdapter(new PhonepeGateway());
        stripe.processPayment(1250.75);
    }
}
