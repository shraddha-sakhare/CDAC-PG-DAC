
/*
5. Reverse Array in Place 
Problem: Write a Java program to reverse an array in place. 
Test Cases: 
Input: arr = [1, 2, 3, 4] 
Output: [4, 3, 2, 1] 
Input: arr = [7, 8, 9] 
Output: [9, 8, 7]  
*/

import java.util.*;


 class ReverseArray
{
	
static int traversalArray(int[] arr, int n) 
{
    if (n <= 0) 
       return 0; 
    System.out.print(arr[n - 1] + " ");
    return traversalArray(arr, n - 1);
}

    public static void main(String[] args) 
	{
		int arr[]={1, 2, 3, 4, 5};

        traversalArray(arr, 5);
		//System.out.println(arr);//hashcode
    }
}