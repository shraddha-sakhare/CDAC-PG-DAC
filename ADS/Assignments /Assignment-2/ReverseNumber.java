
/*
7. Reverse a Number 
Problem: Write a Java program to reverse a given number. 
Test Cases: 
Input: 12345 
Output: 54321 
Input: -9876 
Output: -6789 
*/

import java.util.*;


 class ReverseNumber
{
	
static int traverseArray(int[] arr, int n) 
{
    if (n <= 0) 
       return 0; 
    System.out.print(arr[n - 1] + " ");
    return traverseArray(arr, n - 1);
}

    public static void main(String[] args) 
	{
		int arr[]={1, 2, 3, 4, 5};

        traverseArray(arr, 5);
		System.out.println(arr);
    }
}