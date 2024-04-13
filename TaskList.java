package TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, int priority) {
        tasks.add(new Task(description, priority));
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            System.out.println("Task List:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
