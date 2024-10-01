

class LinkedList3
{
	Node head;
	
	 static class Node
	{
		int data ;
		Node next;  //class ka obj 

		Node(int d)
		{
		data=d;
		next=null;
		}
    }
	
	void display()
	{
		Node n= head;
		while(n != null)
		{
			System.out.print(n.data+ "---->");
			n=n.next;
		}
	}
	
		 void insert(int new_data)
	{
		Node new_node =new Node(new_data); //create new node allocate memory
		new_node.next=head;//new node nxt connect to head
		head=new_node;//head connect to new node
	}
	
	 void insertafter(Node prev_node,int new_data)
	{
		Node new_node =new Node(new_data);//create new node allocate memory
		new_node.next=prev_node.next;//right side link
		prev_node.next=new_node;//left side link 
	}
	
	void append(int new_data)//insert ata the end of list 
	{
		Node new_node =new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=  null;
		Node last=head;
		while(last.next != null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	void deleteNode(int key)
	{
		Node temp=head, prev = null;
		
		//deletion ata the beginning 
		if(temp != null && temp.data == key)
		{
			head= temp.next;
			return;
		}
		
		//deletion in the beginning and last node 
		while(temp != null && temp.data != key )
		{
			prev = temp;//shift the pointers 
			temp= temp.next;
		}
		//non existing element 
		if(temp == null )
			return;
		prev.next = temp.next;
		

		
	}
	
	void deleteNode1(int position)
	{
		if(head ==  null)
			return;
		
		Node temp=head;
		
		//deletion ata teh begining
		if(position == 0)
		{
			head = temp.next;//head position change
			return;
		}
		
		for(int i=0;temp != null && i<position -1; i++)
		{
			temp= temp.next;
			
		}
		if(temp == null ||  temp.next == null)
			return;
		Node next= temp.next.next;
		temp.next= next;
	}
	public static void main(String args[])
	{
		
		LinkedList3 l1=new LinkedList3();
		
		//noed creation
		l1.head = new Node(10);
		
		Node second = new  Node(20);
		Node third = new Node(30);
		
		//list creation
		l1.head.next=second;   //source to destination connect
		second.next=third;
		
		l1.display();
		System.out.println();
		l1.insert(40);
		l1.insert(50);
		l1.display();
		System.out.println();
			
		l1.insertafter(l1.head,60);
		l1.display();
		System.out.println();
		
		
		l1.insertafter(l1.head.next.next,100);
		l1.display();
		System.out.println();
		
		
		l1.append(11);
		l1.display();
		System.out.println();
		
		l1.deleteNode(20);
		l1.display();
		System.out.println();
		
			l1.deleteNode1(2);
		l1.display();
		System.out.println();
	}
}
	

/*
	 void insertafter(Node prev_node,int new_data)
	{
		Node new_node =new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	
	
	
	
	void deleteNode(int key)
	{
		Node temp=head, prev = null;
		
		//deletion ata the beginning 
		if(temp != null && temp.data == key)
		{
			head= temp.next;
			return;
		}
		
		//deletion in the beginning and last node 
		while(temp != null && temp.data != key )
		{
			prev = temp;//shift the pointers 
			temp= temp.next;
		}
		//non existing element 
		if(temp == null )
			return;
		prev.next = temp.next;
		

		
	}
	
	void deleteNode(int position)
	{
		if(head ==  null)
			return;
		
		Node temp=head;
		
		//deletion ata teh begining
		if(position == 0)
		{
			head = temp.next;//head position change
			return;
		}
		
		for(int i=0;temp != null && i<position -1; i++)
		{
			temp= temp.next;
			
		}
		if(temp == null ||  temp.next == null)
			return;
		Node next= temp.next.next;
		temp.next= next;
	}
		
	
	
	*/
	
	
/*	
	intervoew question
	
	//deletion of linked list
	
	void deleteList()
	{
		head= null;
	}
	
	
	
	//count  nodes
	int count()
	{
		Node temp= head;
		int c=0;
		while(temp != null)
		{
			c++;
			temp= temp.next;
		}
	
	}
	
	//can u right in a recursive manner 
	int countRec(Node node)
	{
		//base condition 
		if(node== null)
			return 0;
		return 1+countRec(node.next);
	}
	countRec(head) //call in main method
	
	// search an elemnt in a linked list   2,7,9
	
	boolean search(Node head, int x)//x=9, search element
	{
		Node n=head;
		while(n != null)
		{
			if(n.data == x)
			return true;//element found
		n=n.next;
		}
		return false; //element not found 
			
	}
	
	//reverse of a linked list 
	
	Node reverse(Node node)
	{
		Node prev = null;
		Node current= node; //starting pt of the list
		Node next=null;
		
		while(current != null)
		{
			//link reversal
			next= current.next;
			current.next= prev;
			//pointer updation
			prev= current;
			current= next;
		}
		node = prev;
		return node;
	}
	
	//print middle element of the linked list :
	
void middlepoint ()
{
	Node ptr1;//slow pointer 1 node ahed traverse
	Node ptr2;//fast pointer  2 node ahed travesre
	while(ptr1 != null && ptr2 !=null)
	{
		ptr1 = ptr1.next;//1 node travere
		ptr2 = ptr2.next.next;//2-2 node travese
	}
	System.out.println(ptr1.data);
		
}

//detect a loop in linkedlist
boolean detectLoop(Node head)
{
	Node slow = head;
	Node fast= head;
	while(fast != null && fast.next != null)
	{
		slow= slow.next;
		fast= fast.next.next;
		if(slow ==fast)
			return true;
	}
	return false;
	
	
}

000//merge  two of sorted list 
Node merge(Node l1, Node l2) //l1 list first node l2 list first node
{
	if(l1== null)
	  return l2;
  if(l2 == null)
	  return l1;
  
  
  if (l1.data<l2.data)
  {
	  l1.next = merge(l1.next , l2);
	  return l1;
  }
  else
  {
	  l2.next = merge(l1,l2.next);
	  return l2;
  }

	  
}



*/