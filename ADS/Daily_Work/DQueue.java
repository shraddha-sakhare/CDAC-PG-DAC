class DQueue{
	
	int size=5;
	int DQ[]=new int[size];
	int front,rear;
	
	DQueue()
	{
		front =-1;
		rear=0;
	}
	
	boolean isEmpty()
	{
		return (front==-1);
	}
	
	boolean isFull()
	{
		return((front==0 && rear == size-1) || front == rear+1); //change 
	}
	
	void insertfront(int key)
	{
		if(isFull())
		{
			System.out.println("Overflow/Queue is full");
		}
		
		//first element inserted
		if(front ==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
		
			front=size-1;
		
		else
			
			front=front-1;
			
		DQ[front]=key;
					
	}
	
	insertrear(int key)
	{
		if(isFull())
		{
			System.out.println("full!");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(rear==size-1)
			rear=0;
		
		else
			rear=rear+1;
		
			DQ[rear]=key;
		
	}
	
	void deletefront()
	{
		if(isEmpty())
		{
			System.out.println("empty!");
			return;
		}
		
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front== size-1)
			front=0;
		
		else
			front=front+1;
	}
	
	
	void deleterear()
	{
		f(isEmpty())
		{
			System.out.println("Empty!");
			return;
		}
		
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
			rear=size-1;
		
		else
		rear=rear+1;
	}
	
	int getfront()
	{
		if(isEmpty)
		{
			System.out.println("Empty!");
			return -1;
		}
		return DQ[front];
	}
	
	int getrear()
	{
		if(isEmpty()||rear <0)
		{
			System.out.println("empty!");
			return -1;
		}
		return DQ[rear];
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

