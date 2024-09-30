
/*
2. Remove Array Duplicates 
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the 
array. 
 
Test Cases: 
 
Input: arr = [1, 1, 2] 
Output: 2 
Input: arr = [0, 0, 1, 1, 2, 2, 3, 3] 
Output: 4
*/
import java.util.Arrays;


class RemoveElement
{
	public static void isDuplicate(int arr[]){
		
		boolean flag = true;	//default value
		Arrays.sort(arr);	
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1]){			
				System.out.print(arr[i]+" ");
				
				flag = false;
			
			}
			
		}
	
		if(flag == true)

			System.out.print("-1");		
			
	}

	public static void main(String args[])
	{
		int n = 5;
		int arr [] = {1,2,4,4,5,5,2};
		isDuplicate(arr);
	}
}
	