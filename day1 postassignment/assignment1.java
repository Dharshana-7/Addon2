package post_assignment;

import java.util.Scanner;

public class assignment1 {

	static int[] arr = new int[100]; // large enough array
    static int size = 0;             // current number of elements
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(); // start the menu
    }

    // Recursive menu method
    static void menu() {
        System.out.println("\n=== Array Menu ===");
        System.out.println("1. Insert Element");
        System.out.println("2. Delete Element");
        System.out.println("3. Display Array");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                insertElement();
                menu(); // recursive call
                break;
            case 2:
                deleteElement();
                menu();
                break;
            case 3:
                displayArray();
                menu();
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Try again.");
                menu();
        }
    }

    static void insertElement() {
        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();
        arr[size] = value;
        size++;
        System.out.println("Inserted.");
    }

    static void deleteElement() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter position to delete (1 to " + size + "): ");
        int pos = sc.nextInt();
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = pos - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted.");
    }

    static void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

	}


