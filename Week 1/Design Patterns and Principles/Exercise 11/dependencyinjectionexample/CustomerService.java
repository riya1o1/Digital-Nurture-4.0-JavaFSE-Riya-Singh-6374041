package dependencyinjectionexample;

public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String customerId) {
        String customerDetails = repository.findCustomerById(customerId);
        System.out.println("Customer Details: " + customerDetails);
    }
}
