package dependencyinjectionexample;

public class CustomerApp {
    public static void main(String[] args) {
        
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer("C101");
    }
}
