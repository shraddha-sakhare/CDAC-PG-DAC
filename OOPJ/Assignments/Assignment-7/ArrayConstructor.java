package Ass_6_sir;


/*
 *  Declare a single-dimensional array as a field inside a class and instantiate it inside the 
class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality. 
 * */
 
import java.util.Scanner;


class Array{
	public Array(int[] arr) {

	}
	
	public void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 array numbers :");
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
    }
	public void printRecord(int[] arr) {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class ArrayConstructor {
	
	public static void main(String[] args) {
        int[] arr = new int[5];
        Array Ac=new Array(arr);
        Ac.acceptRecord(arr);
        Ac.printRecord(arr);
	}

}

