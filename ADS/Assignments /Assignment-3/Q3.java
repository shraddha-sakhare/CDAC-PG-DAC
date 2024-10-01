/*
3. Reverse a string using a stack. 
 Test Case 1: 
Input: "hello" 
Output: "olleh" 
 Test Case 2: 
Input: "world" 
Output: "dlrow" 
*/


import java.util.Scanner;
class Stack{
	int top=-1;
	char[] arr=new char[50];
	public void push(char c)
	{
		if(top>=50)
		{
			System.out.println("Stack is full");
		}else
		{
			top=top+1;
			arr[top]=c;
		}
		
	}	
	public void display()
	{   
	for(int j=top;j>=0;j--)
	{
		System.out.print(arr[j]);
	}		
}
}
public class Q3
{
	public static void main(String args[])
	{
    Stack S=new Stack();
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int length=str.length();
	for(int i=0;i<length;i++)
	{
		S.push(str.charAt(i));		
	}
	S.display();
}
}