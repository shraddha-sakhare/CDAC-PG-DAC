
/*
4. Reverse a String 
Problem: Write a Java program to reverse a given string. 
Test Cases: 
Input: "hello" 
Output: "olleh" 
Input: "Java" 
Output: "avaJ"
*/

import java.util.*;

public class ReverseString 
{
 static String traverseString(String str) 
{
    if (str.isEmpty()) return str;
    return traverseString(str.substring(1)) + str.charAt(0);
}
//System.out.println(traverseString("abcde"));

 public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input:");
		String s= sc.next();

System.out.println("output: " + traverseString(s));
	}
	}
	
	
	

/*

import java.util.*;


public class ReverseString 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input:");
	 String str =sc.next();
        String rev ="";  

        
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); 
        }

        System.out.println("output: " + rev);
    }
}




*/