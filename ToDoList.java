import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    // List to store tasks
    private ArrayList<String> tasks = new ArrayList<>();

    // Method to display menu
    public void displayMenu() {
        System.out.println("\nTo-Do List Menu:");
        System.out.println("1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Remove a task");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add a task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to view all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found. Start adding some!");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to remove a task
    public void removeTask(int taskNumber) {
        if (taskNumber <= tasks.size() && taskNumber > 0) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number. Try again.");
        }
    }

    // Main method
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            toDoList.displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    toDoList.viewTasks();
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}