class DLL1{
	
	Node head;
	
	static class Node  
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data =d;
			prev=null;
			next= null;
		}
	}
	
	//insert at begining 
	void insert (int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next= head;
		new_node.prev=null;
		
		if(head !=null)
			head.prev= new_node;
		head= new_node;
		
	}
	
	void display(Node n)
	{
		Node  p = null;
		System.out.println("Forward Direction:");//n
		
		while (n != null)
		{
			System.out.print(n.data + "--->");
			p=n;
			n= n.next;
		}
		System.out.println();
		
		System.out.println("Reverse  Direction:");//p
		while(p != null)
		{
			System.out.print(p.data + "<---");
			p= p.prev;
		}
		
		
	}
	
void insertafter(Node prev_node,int new_data)// prev node batayga ki konse node k baad  insert krna hai 
{
	if(prev_node == null)
	{
		System.out.println("Empty list / Node cannot exixst");
		return;
	}
	Node new_node = new Node(new_data);
	new_node.next= prev_node.next;
    prev_node.next=new_node;
	new_node.prev=prev_node;
	if(new_node.next != null)
	  new_node.next.prev=new_node;
	
}


//insertion at the end 
void append (int new_data)
{
	Node new_node= new Node(new_data);//new node create 
	Node last= head;//creating a reference connect to head 
	new_node.next=null;
	if(head ==null)//list is empty check condition
	{
		new_node.prev = null;
		head= new_node;
		return;
	}
	while(last.next != null)//lat ka next null hai ya nhhi
	last = last.next;

last.next= new_node;//last ka next new node link
new_node.prev = last;//new node ka prev connect last 
	
}

	//deletea node
                 //head bhejana
void deletenode(Node del)//jisko del krna hai vo  in recursive order
{
	//empty list
if(head==null  || del == null)
	return;

   //deletion at athe begining
if(head == del) //delete a head node
//head= head.next;
head=del.next;

//deletion in last  & between
if(del.next != null)
{
	del.next.prev=del.prev ;//delete inn between  33---1
	
}
if(del.prev != null)//last element delete krna hai to //prev node null hai ya nhi 
{
	del.prev.next= del.next;//1---3
}
return;

}
	public static void main(String args[])
	{
		DLL1 d1 = new DLL1();
		d1.insert(6);
		d1.insert(7);
		d1.insert(8);
		d1.insert(9);
		d1.display(d1.head);
		System.out.println();
		d1.insertafter(d1.head,10);//head k baad insert
			d1.display(d1.head);
		System.out.println();
		d1.append(100);//last node mein insert kro 
			d1.display(d1.head);
		System.out.println();
		d1.deletenode(d1.head.next);
		d1.display(d1.head);
        		System.out.println();//last node mein insert kro 
	}   			
}




/*

//insertion in between 

void insertafter(Node prev_node,int new_data)// prev node batayga ki konse node k baad  insert krna hai 
{
	if(prev_node == null)
	{
		System.out.println("Empty list / Node cannot exixst");
		return;
	}
	Node new_node = new Node(new_data);
	new_node.next= prev_node.next;
    prev_node.next=new_node;
	new_node.prev=prev_node;
	if(new_node.next != null)
	  new_node.next.prev=new_node;
	
}


//insertion at the end 
void append (int new_data)
{
	Node new_node= new Node(new_data);//new node create 
	Node last= head;//creating a reference connect to head 
	new_node.next=null;
	if(head ==null)//list is empty check condition
	{
		new_node.prev = null;
		head= new_node;
		return;
	}
	while(last.next != null)//lat ka next null hai ya nhhi
	last = last.next;

last.next= new_node;//last ka next new node link
new_node.prev = last;//new node ka prev connect last 
	
}




//deletea node
                 //head bhejana
void deletenode(Node del)//jisko del krna hai vo  in recursive order
{
	//empty list
if(head==null  || del == null)
	return;

   //deletion at athe begining
if(head == del) //delete a head node
//head= head.next;
head=del.next;

//deletion in last  & between
if(del.next != null)
{
	del.next.prev=del.prev //delete inn between  33---1
	
}
if(del.prev != null)//last element delete krna hai to //prev node null hai ya nhi 
{
	del.prev.next= del.next;//1---3
}
return;

}
*/


