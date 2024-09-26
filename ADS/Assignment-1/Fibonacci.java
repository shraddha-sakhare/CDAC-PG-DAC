
/*

4.  Fibonacci Series 
Problem: Write a Java program to print the first n numbers in the 
Fibonacci series. 
*/

import java . util.*;


class Fibonacci{
public static int fib(int n){
		if(n<=1){
			return n ;
		}
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
			System.out.print(fib(i) + " ");
		}
	}
}