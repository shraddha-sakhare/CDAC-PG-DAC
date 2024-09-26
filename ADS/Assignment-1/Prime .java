/*

2. Prime Number 
Problem: Write a Java program to check if a given number is 
prime. 
Test Cases: 
Input: 29 
Output: true 
Input: 15 
Output: false

*/
import java.util.Scanner;

class Prime
{
public static void main(String[] args)
{
	System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int num=19;
		int flag = 0;
		for(int i =2;i<num/2;i++){
			if(num % i == 0){
				flag = 1;
			}
		}
		if(flag == 0){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
}

}



