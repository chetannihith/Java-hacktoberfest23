import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

class Task {
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String description, LocalDate dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markAsCompleted(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the Task Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }

            checkReminders();
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nTask Manager Menu:");
        System.out.println("1. Create a Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void createTask(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dateStr = scanner.next();
        LocalDate dueDate = LocalDate.parse(dateStr);

        Task newTask = new Task(description, dueDate);
        tasks.add(newTask);

        System.out.println("Task created successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println((i + 1) + ". " + task.getDescription() + " - Due: " + task.getDueDate() +
                        " - Completed: " + (task.isCompleted() ? "Yes" : "No"));
            }
        }
    }

    private static void markAsCompleted(Scanner scanner) {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter the number of the task to mark as completed: ");
            int taskNumber = scanner.nextInt();

            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                Task task = tasks.get(taskNumber - 1);
                task.setCompleted(true);
                System.out.println("Task marked as completed: " + task.getDescription());
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    private static void checkReminders() {
        System.out.println("\nChecking for overdue tasks...");
        LocalDate currentDate = LocalDate.now();
        for (Task task : tasks) {
            if (!task.isCompleted() && currentDate.isAfter(task.getDueDate())) {
                System.out.println("Reminder: Task \"" + task.getDescription() + "\" is due!");
            }
        }
    }
}
