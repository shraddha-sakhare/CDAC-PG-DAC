/*
6. Reverse Words in a String 
Problem: Write a Java program to reverse the words in a given sentence. 
Test Cases: 
Input: "Hello World" 
Output: "World Hello" 
Input: "Java Programming" 
Output: "Programming Java"
*/


import java.util.*;


public class ReverseWord

{		
	public static void printReverse(String sentence)
	{
		String[] words = sentence.split(" ");
		for(int i=words.length-1; i>=0 ; i--)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first sentence");
		String s1 = sc.nextLine();
		System.out.println("enter second sentence");
		String s2 = sc.nextLine();	
		printReverse(s1);
		printReverse(s2);
	}

}