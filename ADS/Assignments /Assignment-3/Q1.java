/*
1. Implement a Stack using an array. 
 Test Case 1: 
Input: Push 5, 3, 7, Pop 
Output: Stack = [5, 3], Popped element = 7 
 Test Case 2: 
Input: Push 10, Push 20, Pop, Push 15 
Output: Stack = [10, 15], Popped element = 20 
*/

class Stack{
int top =-1;
int[] arr= new int[10];
public void push(int value)
{
if (top>=10)
{
System.out.println("Stack is full");

}else 
{
top=top+1;
arr[top]=value;
}
}
public void pop()
{
if(top==-1)
{
System.out.println("Stack is empty");
}
else
{
top=top-1;
}
}
public void display()
{
System.out.print("Stack= [ ");
for (int j=0;j<=top;j++)
{
  System.out.print(arr[j]+",");
}
System.out.print("]");
}
public void poped()
{
	System.out.println("\nPoped Element:"+arr[top+1]);
}
}
public class Q1{
public static void main (String args[])
{
Stack S=new Stack();
System.out.println("Test Case 1:");
S.push(5);
S.push(3);
S.push(7);
System.out.println("Stack After Push:");
S.display();
S.pop();
System.out.println("\nStack After Pop:");
S.display();
S.poped();
System.out.println("\n------------------");
S.pop();
S.pop();
System.out.println("Test Case 2:");
S.push(10);
S.push(20);
S.pop();
S.poped();
S.push(15);
S.display();
}
}