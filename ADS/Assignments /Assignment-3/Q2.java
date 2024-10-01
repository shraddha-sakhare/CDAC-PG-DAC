/*
2. Check for balanced parentheses using a stack. 
 Test Case 1: 
Input: "({[()]})" 
Output: Balanced 
 Test Case 2: 
Input: "([)]" 
Output: Not Balanced 
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
	}else if(c=='('||c=='{'||c=='[')
		{
			top=top+1;
			arr[top]=c;
		}else if(arr[top]=='(')
        {
            if(c==')')
            {
                pop();
            }
        }else
         if(arr[top]=='[')
        {
            if(c==']')
            {
                pop();
            }
        }else
        if(arr[top]=='{')
        {
		if(c=='}')
            {
                pop();
            }
        }else 
        {
            top=top+1;
            arr[top]=c;
        }
    }
	public void pop()
	{
		
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}else
			top=top-1;
	}
	
	
	public void display()
	{
		for(int j=top;j>=0;j--)
		{
			System.out.println(arr[top]);
		}
		if(top==-1)
		{
			System.out.println("Stack is balanced !!");
		}else{
			System.out.println("Stack is unbalanced !!");
		}
	}		
}
public class Q2
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