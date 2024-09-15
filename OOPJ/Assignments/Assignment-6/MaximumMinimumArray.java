package Ass_6_sir;

import java.util.Scanner;

/*
 * Write a program to find the maximum and minimum values in a single-dimensional array 
of integers.
 */

public class MaximumMinimumArray {
	public static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	private static void printRecord(int arr[]) {
		for (int element : arr) {
			System.out.print(" "+element);
		}
	}

	private static void max(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("\n max value:"+max);
		
	}
		private static void min(int arr[]) {
			int min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i] < min ) {
					min=arr[i];
				}
			}
			System.out.println("\n min value:"+min);
	}

	public static void main(String[] args) {
		System.out.println("enter the number array");
		int n=sc.nextInt();
		int[] arr=new int[5];
		MaximumMinimumArray.acceptRecord(arr);
		MaximumMinimumArray.printRecord(arr);
		MaximumMinimumArray.max(arr);
		MaximumMinimumArray.min(arr);
		
		int min = arr[0];

	}

}
