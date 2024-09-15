package Ass_6_sir;

import java.util.Scanner;

/*
Write a program to remove duplicate elements from a single-dimensional array of 
integers.
*/


public class RemoveDuplicateElement {
	
	   public static Scanner sc = new Scanner(System.in);

	    private static void acceptRecord(int arr[]) {
	        System.out.println("Enter " + arr.length + " elements:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	    }

	    private static void printRecord(int arr[], int length) {
	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static int removeDuplicates(int[] arr) {
	        int n = arr.length;
	        if (n == 0 || n == 1) {
	            return n;
	        }

	        int[] temp = new int[n];
	        int j = 0;

	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }

	        temp[j++] = arr[n - 1];

	        for (int i = 0; i < j; i++) {
	            arr[i] = temp[i];
	        }

	        return j;
	    }

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        acceptRecord(arr);

    
        int newLength = removeDuplicates(arr);

        printRecord(arr, newLength);
	}

}






/*
import java.util.Scanner;

public class RemoveDuplicateElement {

    public static Scanner sc = new Scanner(System.in);

    // Method to accept elements into the array
    private static void acceptRecord(int arr[]) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to print elements of the array
    private static void printRecord(int arr[], int length) {
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to remove duplicates
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Traverse the input array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[n - 1];

        // Copy unique elements back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j; // Return the new length of the array
    }

    public static void main(String[] args) {
          System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        acceptRecord(arr);

        // Sort the array to group duplicates together
        java.util.Arrays.sort(arr);

        // Remove duplicates and get the new length
        int newLength = removeDuplicates(arr);

        // Print the updated array
        printRecord(arr, newLength);
    }
}
*/
