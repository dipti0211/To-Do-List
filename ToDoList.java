//Simple To Do List

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        // Create a list to store the to-do items
        ArrayList<String> toDoItems = new ArrayList<>();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to your to-do list!");

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add a to-do item");
            System.out.println("2. View to-do list");
            System.out.println("3. Quit");

            // Get user's choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handle user's choice
            switch (choice) {
                case 1:
                    // Add a to-do item
                    System.out.print("Enter a to-do item: ");
                    String toDoItem = scanner.nextLine();
                    toDoItems.add(toDoItem);
                    System.out.println("Item added to your to-do list!");
                    break;
                case 2:
                    // View the to-do list
                    System.out.println("Your to-do list:");
                    for (int i = 0; i < toDoItems.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoItems.get(i));
                    }
                    break;
                case 3:
                    // Quit the program
                    System.out.println("Have a Good Day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
