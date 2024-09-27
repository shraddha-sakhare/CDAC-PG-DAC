/*
7. Find Repeated Characters in a String 
Problem: Write a Java program to find all repeated characters in 
a string. 
Test Cases: 
Input: "programming" 
Output: ['r', 'g', 'm'] 
Input: "hello" 
Output: ['l'] 

*/

import java.util.*;

public class RepeatedString {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] characterCount = new int[26]; 

        for (int i = 0; i < input.length(); i++) {
            characterCount[input.charAt(i) - 'A']++;
        }

        System.out.print("Repeated characters is : ");
        for (int i = 0; i < characterCount.length; i++) {
            if (characterCount[i] > 1) {
                System.out.print((char) ('A' + i) + ", ");
            }
        }
    }
}