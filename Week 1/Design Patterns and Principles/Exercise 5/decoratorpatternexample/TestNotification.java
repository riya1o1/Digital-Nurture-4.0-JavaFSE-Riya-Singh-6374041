package decoratorpatternexample;

public class TestNotification {
    public static void main(String[] args) {
       
        Notifier basicNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        fullNotifier.send("System maintenance scheduled at 10 PM.");
    }
}
