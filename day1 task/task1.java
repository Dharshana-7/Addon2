package practice;

import java.util.Scanner;

public class task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Original array
        int[] arr = {10, 20, 30};
        System.out.print("Enter a number to insert: ");
        int num = sc.nextInt();

        // Insert at first
        int[] firstInsert = new int[arr.length + 1];
        firstInsert[0] = num;
        for (int i = 0; i < arr.length; i++) {
            firstInsert[i + 1] = arr[i];
        }
        System.out.print("After inserting at first: ");
        printArray(firstInsert);

        // Insert at middle
        int middle = firstInsert.length / 2;
        int[] middleInsert = new int[firstInsert.length + 1];
        for (int i = 0; i < middle; i++) {
            middleInsert[i] = firstInsert[i];
        }
        middleInsert[middle] = num;
        for (int i = middle; i < firstInsert.length; i++) {
            middleInsert[i + 1] = firstInsert[i];
        }
        System.out.print("After inserting at middle: ");
        printArray(middleInsert);

        // Insert at last
        int[] lastInsert = new int[middleInsert.length + 1];
        for (int i = 0; i < middleInsert.length; i++) {
            lastInsert[i] = middleInsert[i];
        }
        lastInsert[lastInsert.length - 1] = num;
        System.out.print("After inserting at last: ");
        printArray(lastInsert);
    }

    // Method to print array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
				
			}

	
}

	


