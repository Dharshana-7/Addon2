package SinglyLinkedlist;

public class task9 {   //insertatanyposition
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public void insert(int data)
	{
		Node node=new Node(data);
		node.data=data;
		node.next=null;
		
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node newnod=head;
			while(newnod.next!=null)
			{
				newnod=newnod.next;
			}
			
			newnod.next=node; 
		}
	}

	
	
	public void insertatany(int index,int data)
	{
		Node node=new Node(data);
		node.data=data;
		
		if (index==0) {
	        node.next=head;
	        head=node;
	        return;
		}
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}		
 
		
	
	public void display()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}		



	public static void main(String[] args) {
   task9 list1=new task9();
		
		list1.insert(78);
		list1.insert(10);
		list1.insert(48);
		list1.insertatany(1, 77);
		list1.insert(49);
		list1.display();

	}

		
	}
