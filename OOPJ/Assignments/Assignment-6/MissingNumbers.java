package Ass_6_sir;


/*
 * 		Write a program to find the missing number in an array of integers ranging from 1 to N. 
 */
public class MissingNumbers {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,6,7,8};
	        int totalArrayNumbers = 8;

	        int afterSum = totalArrayNumbers * (totalArrayNumbers + 1) / 2;
	        int Sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            Sum += arr[i];
	        }

	     
	        int missingNumbers = afterSum - Sum;
	        System.out.println("Missing number of array is : " + missingNumbers);
	    }
	}




/*

import java.util.*;
class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};
        int n = 5;

        // Calculate expected sum and actual sum
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }

        // Find missing number
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

*/