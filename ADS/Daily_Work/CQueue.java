class CQueue{
	
	int size=5;
	int CQ[]=new int[size];
	int front,rear;
	
	CQueue()
	{
		front =-1;
		rear=-1;
	}
	
	boolean isEmpty()
	{
		return (front==-1);
	}
	
	boolean isFull()
	{
		return((rear +1)% size == front); //change 
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(front==-1)
			{
				front=0; //set front to 0n if queue is empty 
			}
			rear=(rear+1)%size; //r++ but connect to size
			CQ[rear]=x;
			System.out.println(x +" Inserted");
		}
	}
	
	int  dequeue()
	{
		//Already empty queue
		
		if(isEmpty())
		{
			System.out.println("Queue is empty");//true return kiya to
		return -1;	
		}
		
		else
		{
			int x=CQ[front];
			System.out.println(x+" Deleted");
			
			if(front == rear)//empty queue mein chalega tab 
			{
				front=-1;
				rear=-1;
			}				
			
		    else 
			{
				front=(front +1)%size;//f++
		    }
         return x;			
		}			
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty queue");
		}
		else
		{
			System.out.print("Queue elements:");
			int i=front;
			while(i != rear)
			{
				System.out.print(CQ[i]+" ");
				i=(i+1)%size;
			}
			System.out.print(CQ[rear]);
			System.out.println();
		}
	}
	/*
	or
	
	for(int i=front;i!=rear;i=(i+1)%size)
	{
		sop(CQ[i]);
	}
	*/
public static void main(String args[])
{
CQueue cq1= new CQueue();
    cq1.enqueue(11);
	cq1.enqueue(12);
	cq1.enqueue(13);
	cq1.enqueue(14);
	cq1.enqueue(11);
	
	
	cq1.display();
	
	cq1.dequeue();
	cq1.display();
	

	
	
	
}
}

