package adapterpatternexample;

public class PhonepeGateway {
    public void executeTransaction(double value) {
        System.out.println("Paid " + value + " from PhonePe.");
    }
}