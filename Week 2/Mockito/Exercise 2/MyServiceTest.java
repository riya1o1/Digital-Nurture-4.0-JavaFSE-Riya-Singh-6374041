package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        System.out.println("== Running testVerifyInteraction ==");

        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Inject mock into service and call method
        MyService service = new MyService(mockApi);
        service.fetchData(); // This should internally call mockApi.getData()

        // Step 3: Verify interaction with specific method call
        verify(mockApi).getData(); // Verifies getData() was called once

        System.out.println("Verified: getData() was called on ExternalApi mock.");
        System.out.println("== testVerifyInteraction Passed ==\n");
    }
}
