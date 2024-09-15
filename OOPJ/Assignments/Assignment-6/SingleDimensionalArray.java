package Ass_6_sir;

import java.util.Scanner;

/*
 * Declare a single-dimensional array of 5 integers inside the 
main
 method. Traverse the 
array to print the default values. Then accept records from the user and print the updated 
values of the array. 
 * 
 * */



public class SingleDimensionalArray {
	
	private static Scanner sc=new Scanner(System.in);
	public void acceptRecord(int [] arr) {
		System.out.println("\n updated values\n ");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
	}
		
		public void printRecord(int [] arr) {
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(" " +arr[i]);
			}
	}
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println("default value:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " +arr[i]);
		}
		
		SingleDimensionalArray sda=new SingleDimensionalArray();
		sda.acceptRecord(arr);
		sda.printRecord(arr);
	

	}

}
