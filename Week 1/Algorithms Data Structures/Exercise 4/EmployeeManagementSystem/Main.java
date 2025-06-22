public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Bob", "Tester", 45000));
        manager.addEmployee(new Employee(3, "Charlie", "Manager", 80000));

        System.out.println("\nAll Employees:");
        manager.displayAllEmployees();

        System.out.println("\nSearch Employee with ID 2:");
        Employee e = manager.searchEmployee(2);
        System.out.println(e != null ? e : "Not found");

        System.out.println("\nDeleting Employee with ID 2:");
        manager.deleteEmployee(2);

        System.out.println("\nAll Employees after deletion:");
        manager.displayAllEmployees();
    }
}
