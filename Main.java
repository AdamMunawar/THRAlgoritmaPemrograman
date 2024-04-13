package TaskList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority: ");
                    int priority = scanner.nextInt();
                    taskList.addTask(description, priority);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    taskList.displayTasks();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
