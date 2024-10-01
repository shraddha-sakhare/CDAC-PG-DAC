
/*
8. Array Manipulation 
Problem: Perform a series of operations to manipulate an array based on range update queries. Each query 
adds a value to a range of indices. 
Test Cases: 
Input: n = 5, queries = [[1, 2, 100], [2, 5, 100], [3, 4, 100]] 
Output: 200 
Input: n = 4, queries = [[1, 3, 50], [2, 4, 70]] 
Output: 120
*/

import java.util.*;

public class ArrayManipulation {

    public static int[] manipulateArray(int n, int[][] queries) {
        int[] arr = new int[n + 1]; 

      
        for (int[] query : queries) {
            int a = query[0] - 1;  
            int b = query[1];      
            int k = query[2];
            
            arr[a] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }

     
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
	int[][] queries = {{1, 3, 50}, {2, 4, 70}} ;

        int[] result = manipulateArray(n, queries);
        System.out.println(Arrays.toString(result));  // Output: [100, 200, 200, 200, 100]
    }
}