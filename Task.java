package TaskList;

public class Task {
    private static int nextId = 1;

    private int id;
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.id = nextId++;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Priority: " + priority + ", Description: " + description;
    }
}
