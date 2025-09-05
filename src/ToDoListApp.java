//Simple to do list app...
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        // Create an ArrayList to store the tasks
        ArrayList<String> todoList = new ArrayList<>();
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        // A boolean variable to control the main application loop
        boolean isRunning = true;

        System.out.println("Welcome to your To-Do List Application!");

        // The main application loop
        while (isRunning) {
            // Display the menu of options to the user
            System.out.println("\nPlease choose an option:");
            System.out.println("1. View To-Do List");
            System.out.println("2. Add a new task");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");

            // Read the user's choice
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                continue; // Skip to the next iteration of the loop
            }

            // Use a switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    // Option to view all tasks
                    viewTasks(todoList);
                    break;
                case 2:
                    // Option to add a new task
                    System.out.print("Enter the task you want to add: ");
                    String newTask = scanner.nextLine();
                    addTask(todoList, newTask);
                    break;
                case 3:
                    // Option to mark a task as completed
                    System.out.print("Enter the number of the task to mark as completed: ");
                    try {
                        int indexToComplete = Integer.parseInt(scanner.nextLine()) - 1; // Subtract 1 to get the correct index
                        markTaskCompleted(todoList, indexToComplete);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid task number.");
                    }
                    break;
                case 4:
                    // Option to delete a task
                    System.out.print("Enter the number of the task to delete: ");
                    try {
                        int indexToDelete = Integer.parseInt(scanner.nextLine()) - 1; // Subtract 1 to get the correct index
                        deleteTask(todoList, indexToDelete);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid task number.");
                    }
                    break;
                case 5:
                    // Option to exit the application
                    isRunning = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to add a new task to the list
    public static void addTask(ArrayList<String> list, String task) {
        list.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to view all tasks in the list
    public static void viewTasks(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Your to-do list is empty. Time to add some tasks!");
        } else {
            System.out.println("\n--- Your To-Do List ---");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i)); // Add 1 to display as 1-indexed
            }
            System.out.println("-----------------------");
        }
    }

    // Method to mark a task as completed
    public static void markTaskCompleted(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            String task = list.get(index);
            // Check if the task is already marked as completed
            if (task.startsWith("[DONE] ")) {
                System.out.println("Task is already completed.");
            } else {
                list.set(index, "[DONE] " + task);
                System.out.println("Task marked as completed: " + task);
            }
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to delete a task from the list
    public static void deleteTask(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            String removedTask = list.remove(index);
            System.out.println("Task deleted: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
/*
output:
Welcome to your To-Do List Application!

Please choose an option:
1. View To-Do List
2. Add a new task
3. Mark a task as completed
4. Delete a task
5. Exit
1
Your to-do list is empty. Time to add some tasks!

Please choose an option:
1. View To-Do List
2. Add a new task
3. Mark a task as completed
4. Delete a task
5. Exit
2
Enter the task you want to add: I want to wake up at morning 5 o clock
Task added: I want to wake up at morning 5 o clock

Please choose an option:
1. View To-Do List
2. Add a new task
3. Mark a task as completed
4. Delete a task
5. Exit
3
Enter the number of the task to mark as completed: 1
Task marked as completed: I want to wake up at morning 5 o clock

Please choose an option:
1. View To-Do List
2. Add a new task
3. Mark a task as completed
4. Delete a task
5. Exit
1

--- Your To-Do List ---
1. [DONE] I want to wake up at morning 5 o clock
-----------------------

Please choose an option:
1. View To-Do List
2. Add a new task
3. Mark a task as completed
4. Delete a task
5. Exit

 */
