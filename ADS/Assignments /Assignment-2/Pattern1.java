/* 
1. Printing Patterns 
Problem: Write a Java program to print patterns such as a right triangle of stars. 
 
Test Cases: 
 
Input: n = 3 
Output: 
* 
** 
*** 
Input: n = 5 
Output: 
* 
** 
*** 
**** 
*****

*/
import java.util.*;

class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
               for (int i = 1; i <= n; i++) 
				   {
            for (int j = 1; j <= i; j++)
				{
                System.out.print("*");
            }
			System.out.println();
		}
	}
}
		