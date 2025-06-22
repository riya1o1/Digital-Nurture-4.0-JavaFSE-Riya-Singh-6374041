public class TaskLinkedList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added.");
    }

    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.task.taskId != taskId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task deleted.");
        }
    }
}
