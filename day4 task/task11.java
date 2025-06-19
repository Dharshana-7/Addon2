package Doublylinkedlist;

public class task11 {
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public void insert(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	
	public void traverseforward()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public void traversebackward()
	{
		Node node=tail;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.prev;
		}
	}

	public static void main(String args[])
	{
		task11 list=new task11();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		
		list.traversebackward();
		list.traverseforward();
	}
}
