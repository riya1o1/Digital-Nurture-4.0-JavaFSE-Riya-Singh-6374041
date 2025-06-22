public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test Module", "Pending"));

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearch for Task ID 2:");
        Task t = taskList.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        taskList.deleteTask(2);

        System.out.println("\nAll Tasks After Deletion:");
        taskList.displayTasks();
    }
}
