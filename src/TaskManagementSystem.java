import java.util.Scanner;
public class TaskManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nTask Management System\n");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark as Complete");
            System.out.println("4. Remove Task");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    scanner.nextLine();
                    String taskDescription = scanner.nextLine();
                    taskManager.addTask(taskDescription);
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    taskManager.viewTasks();
                    System.out.print("Enter the number of the task to mark as complete: ");
                    int taskIndex = scanner.nextInt();
                    taskManager.markAsComplete(taskIndex);
                    break;
                case 4:
                    System.out.print("Enter the number of the task to be removed: ");
                    int taskdelIndex = scanner.nextInt();
                    taskManager.deleteTask(taskdelIndex);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
