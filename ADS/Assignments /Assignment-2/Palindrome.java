/*
9. String Palindrome 
Problem: Write a Java program to check if a given string is a palindrome. 
Test Cases: 
Input: "madam" 
Output: true 
Input: "hello" 
Output: false 
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for 
each
*/

import java . util.*;

public class Palindrome
{
	private static String ppp;
  static String traverseString(String str) 
{
    if (str.isEmpty()) return str;
   String ppp=traverseString(str.substring(1)) + str.charAt(0);
   return ppp;
}
//System.out.println(traverseString("abcde"));

 public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input:");
		String s= sc.next();

System.out.println("output: " + ppp);
	}
}
