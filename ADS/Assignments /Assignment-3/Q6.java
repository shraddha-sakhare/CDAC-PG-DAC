
/*
6. Implement a Queue using an array. 
 Test Case 1: 
Input: Enqueue 5, Enqueue 10, Dequeue 
Output: Queue = [10], Dequeued element = 5 
 Test Case 2: 
Input: Enqueue 1, 2, 3, Dequeue, Dequeue 
Output: Queue = [3], Dequeued elements = 1, 2
*/

class Queue{
int front=-1;
int rare=-1;
int[] arr =new int[10]; 
public void enQueue(int data)
{
	if(front==-1&&rare==-1)
	{
		front=0;
		rare=0;
		arr[rare]=data;
	}else if(rare<=9){
		rare=rare+1;
		arr[rare]=data;
	}
	else if(rare==front) {
		System.out.println("Queue is full!!");
	}
}	
public void deQueue()
{
	if(front!=-1&&front<=9)
	{
		System.out.println("Dequeued Element:["+arr[front]+"]");
		front=front+1;
		
	}else 
	{
		System.out.println("Queue is empty!!");
	}
}
public void display()
{
	System.out.print("Queue=[ ");
	for(int i=front;i<=rare;i++)
	{
		System.out.print(arr[i]);
	}
	System.out.print(" ]");
}
}
class Q6{
public static void main (String args[])
{
	Queue Q=new Queue();
	Q.enQueue(5);
	Q.enQueue(10);
	Q.deQueue();
	Q.display();
}

}