package Ass_6_sir;
/*
 Declare a single-dimensional array of 5 integers inside the 
named 
acceptRecord
 main
 method. Define a method 
to get input from the terminal into the array and another method 
named 
printRecord
 to print the state of the array to the terminal. * */
 
import java.util.Scanner;

public class SingleDimension {
	private static Scanner sc = new Scanner(System.in);

	public void acceptRecord(int[] arr) {
		System.out.println("Enter array Elements :");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
	}

	public void printRecord(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[5];

		SingleDimension sd = new SingleDimension();
		sd.acceptRecord(arr);
		sd.printRecord(arr);

	}

}
