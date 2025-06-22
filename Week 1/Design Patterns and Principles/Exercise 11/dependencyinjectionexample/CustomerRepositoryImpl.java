package dependencyinjectionexample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String customerId) {
        // Mock implementation
        return "Customer[id=" + customerId + ", name=Riya Singh, city=Bangalore]";
    }
}
