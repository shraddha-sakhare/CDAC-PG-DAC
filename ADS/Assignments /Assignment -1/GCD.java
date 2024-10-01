/*
Problem: Write a Java program to find the Greatest Common 
Divisor (GCD) of two numbers. 
Test Cases: 
Input: a = 54, b = 24 
Output: 6 
Input: a = 17, b = 13 
Output: 1
*/

import java .util.*;
public class GCD{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		while (b!= 0)
		{
			int temp=b;
			b=a%b;
			a= temp;
		}
		System.out.println("GCD:"+a);
	}
}
