package adapterpatternexample;

public class GooglePayGateway {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " from GooglePay.");
    }
}