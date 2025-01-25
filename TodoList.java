import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;
    private int nextId;

    public TodoList() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String title, String description) {
        Task task = new Task(nextId, title, description);
        tasks.add(task);
        nextId++;
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found with ID " + taskId);
    }

    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
        System.out.println("Task deleted successfully.");
    }
}
