import java.util.ArrayList;

public class Task {
    private String description;
    private boolean complete;

    public Task(String description){
        this.description=description;
        this.complete=false;
    }
    public String getDescription(){
        return description;
    }
    public boolean isComplete(){
        return complete;
    }
    public void markAsComplete(){
        this.complete=true;
    }
}
class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("\nTask List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isComplete() ? "Complete" : "Incomplete";
                System.out.println((i + 1) + ". " + task.getDescription() + " - " + status);
            }
        }
    }

    public void markAsComplete(int taskIndex) {
        if (taskIndex < 1 || taskIndex > tasks.size()) {
            System.out.println("Invalid task index.");
        } else {
            Task task = tasks.get(taskIndex - 1);
            task.markAsComplete();
            System.out.println("Task marked as complete!");
        }
    }
    public void deleteTask(int taskdelIndex){
        if (taskdelIndex < 1 || taskdelIndex > tasks.size()) {
            System.out.println("Invalid task index.");
        }else{
            Task task=tasks.remove(taskdelIndex-1);
            System.out.println("Task removed successfully");
        }

    }
}