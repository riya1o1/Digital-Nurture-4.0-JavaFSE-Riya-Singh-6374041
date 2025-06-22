package adapterpatternexample;

public class PhonepeAdapter implements PaymentProcessor {
    private PhonepeGateway phonepeGateway;

    public PhonepeAdapter(PhonepeGateway phonepeGateway) {
        this.phonepeGateway = phonepeGateway;
    }

    @Override
    public void processPayment(double amount) {
        phonepeGateway.executeTransaction(amount);
    }
}