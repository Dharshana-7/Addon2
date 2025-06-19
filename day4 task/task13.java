package Doublylinkedlist;

public class task13 {

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
	
	
	void insert(int data) {
        Node n = new Node(data);
        if (head == null) { head = n; return; }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n; n.prev = t;
    }

    public void deleteatMiddle() {
        int c = 0;
        for (Node t = head; t != null; t = t.next) c++;

        Node t = head;
        for (int i = 0; i < c / 2; i++) t = t.next;

        if (t.prev != null) t.prev.next = t.next;
        if (t.next != null) t.next.prev = t.prev;
        if (t == head) head = t.next;
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
		task13 list=new task13();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.display();
		list.deleteatMiddle();
		list.display();

	}
}
