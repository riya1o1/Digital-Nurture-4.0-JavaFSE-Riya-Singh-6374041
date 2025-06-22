public class EmployeeManager {
    private Employee[] employees;
    private int count; 

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Employee added.");
        } else {
            System.out.println("Array full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees in the system.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    public void deleteEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                // Shift remaining employees to left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                found = true;
                System.out.println("Employee deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
