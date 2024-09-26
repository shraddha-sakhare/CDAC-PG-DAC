
/*

3. Factorial 
Problem: Write a Java program to compute the factorial of a 
given number. 
*/

import java . util.Scanner;
class Factorial{
	
public static int fact(int num){
		if(num ==1){
			return 1;
		}
		int ans = num * fact(num-1);
		return ans;
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int num=5;
		int ans = fact(num);
		System.out.println("Ans : " + ans);
		
	}
}