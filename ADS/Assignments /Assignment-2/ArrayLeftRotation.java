/*
10. Array Left Rotation 
Problem: Write a Java program to rotate an array to the left by d positions. 
Test Cases: 
Input: arr = [1, 2, 3, 4, 5], d = 2 
Output: [3, 4, 5, 1, 2] 
Input: arr = [10, 20, 30, 40], d = 1 
Output: [20, 30, 40, 10]
*/

import java.util.Arrays;

public class ArrayLeftRotation {
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
           
end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; 
        int d = 1;
        System.out.println(Arrays.toString(rotateLeft(arr, d)));
    }
}