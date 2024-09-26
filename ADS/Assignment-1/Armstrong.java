/*
  
1. Armstrong Number 
Problem: Write a Java program to check if a given number is an 
Armstrong number. 

*/


//153=1^3+5^3+3^3=1+125+27=153

/*
if(n==0){
	return n;
rem=n%10=3
sum=3*3*3=27
n=n/10=15
return sum;

*/

import java.util.Scanner;
import java.lang.Math;

class Armstrong
{
   public static void main(String[] args)
   {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int num=153;
		int sum =0;
	
	 
		while(num!=0){
			int rem = num%2;
			sum +=Math.pow(rem,2);
			num = num/10;
		}
           if(sum%2 == 0){
			System.out.println("Not Armstrong");
		}
		else{
			System.out.println("Armstrong number");
		}
		
    }
}


