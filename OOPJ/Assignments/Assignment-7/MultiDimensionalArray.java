package Ass_6_sir;

import java.util.Scanner;

/*
 * You need to implement a system to manage airplane seat assignments. The airplane has 
seats arranged in rows and columns. Implement functionalities to: 

Initialize the seating arrangement with a given number of rows and columns. seatarrangemnt()
Book a seat to mark it as occupied. occupiedseat()
Cancel a booking to mark a seat as available. canclebook&countavailable()
Check seat availability to determine if a specific seat is available. seatavilable()
Display the current seating chart.displaybookingseat()
menu : seat arangemt/ booking if >0  cancle<0  available ==0  dispaly 
 * 
 */



class AirplaneSeat{
	
	public AirplaneSeat(int arr [][]) {

	}
	
	public static void acceptRecord() {
	  Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter array element");
  for (int row = 0; row < arr.length; row++) {
  	for(int col=0;col<arr[row].length;col++) {
  		arr[row][col] = sc.nextInt();
  	}
  	System.out.println();
  }
	}
	
	public static void printRecord() {
	  for (int row = 0; row < arr.length; row++) {
	  	for(int col=0;col<arr[row].length;col++) {
	  	   System.out.print(arr[row][col] + " ");
	  	}
	  	System.out.println();
	  }
		}
	
	
	public void booking() {
		
	}
	public void cancle() {
		
	}
	public void available() {
		
	}
	public void display() {
		
	}

	
}




public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		AirplaneSeat as= new AirplaneSeat();
		as.acceptRecord();
		as.printRecord();
      
	}

}
