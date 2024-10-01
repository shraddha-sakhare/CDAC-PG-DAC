

class LinkedList1
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
	
	public static void main(String args[])
	{
		
		LinkedList1 l1=new LinkedList1();
		
		//noed creation
		l1.head = new Node(10);
		Node second = new  Node(20);
		Node third = new Node(30);
		
		//list creation
		l1.head.next=second;   //source to destination connect
		second.next=third;
		
		
	}
}
	
	