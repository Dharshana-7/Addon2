package Doublylinkedlist;

public class mainpro {
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
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void traversebackward() {
		Node current=tail;
        while (current!=null) 
        {
            System.out.println(current.data);
            current=current.prev;
        }
    }
	
	public static void main(String[] args) {
		mainpro list1=new mainpro();
		list1.insert(10);
		list1.insert(20);
		list1.insert(30);
		list1.insert(40);
		
		list1.traverseforward();
		list1.traversebackward();

	}


}
