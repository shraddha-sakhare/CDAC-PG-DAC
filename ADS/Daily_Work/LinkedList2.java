

class LinkedList2
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
	public static void main(String args[])
	{
		
		LinkedList2 l1=new LinkedList2();
		
		//noed creation
		l1.head = new Node(10);
		Node second = new  Node(20);
		Node third = new Node(30);
		
		//list creation
		l1.head.next=second;   //source to destination connect
		second.next=third;
		
		l1.display();
		
		
	}
}
	
	