package deekshitha;

import java.util.ArrayList;
import java.util.Scanner;

public class simpletasklist 
{
	public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Choose an option: add, remove, list, or exit");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter the task to add:");
                    String taskToAdd = scanner.nextLine();
                    tasks.add(taskToAdd);
                    System.out.println("Task added.");
                    break;

                case "remove":
                    System.out.println("Enter the task number to remove:");
                    int taskNumberToRemove = Integer.parseInt(scanner.nextLine());
                    if (taskNumberToRemove > 0 && taskNumberToRemove <= tasks.size()) {
                        tasks.remove(taskNumberToRemove - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case "list":
                    System.out.println("Task List:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
