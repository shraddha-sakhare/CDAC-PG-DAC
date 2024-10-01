
/*
9. String Palindrome 
Problem: Write a Java program to check if a given string is a palindrome. 
Test Cases: 
Input: "madam" 
Output: true 
Input: "hello" 
Output: false 
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for 
each:
*/


import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
		System.out.println("Enter any string ");
		Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
	
        if (str.equals(str1.toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}