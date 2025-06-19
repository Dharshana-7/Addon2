package Doublylinkedlist;

public class task12 {

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
	    
	public void insertAtMiddle(int data) {
	        Node n = new Node(data);
	        if (head == null) { head = n; return; }

	        int count = 0;
	        for (Node t = head; t != null; t = t.next) 
	        	count++;

	        Node t = head;
	        for (int i = 0; i < count / 2; i++) 
	        	t = t.next;

	        n.prev = t.prev;
	        n.next = t;

	        if (t.prev != null) t.prev.next = n;
	        else head = n;

	        t.prev = n;
	    }

	    
	    public void insert(int data) {
	        Node n = new Node(data);
	        if (head == null) { head = n; return; }
	        Node t = head;
	        while (t.next != null) t = t.next;
	        t.next = n;
	        n.prev = t;
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
		task12 list=new task12();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.display();
		
		list.insertAtMiddle(60);
		list.display();

	}

}


