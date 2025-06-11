package SinglyLinkedlist;

public class task10 {		//delete at any pos
	Node head;
	class Node
	{
		int data;
		Node next;
	}
	
	public void insert(int data)
	{
		Node node=new Node();
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

	
	public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; i < position; i++) {
            prev = current;
            current = current.next;
            if (current == null) {
                System.out.println("Position out of range.");
                return;
            }
        }
        
        prev.next = current.next;
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
		task10 list3=new task10();
		list3.insert(20);
		list3.insert(30);
		list3.insert(40);
		list3.insert(50);
		list3.deleteAtPosition(2);
		
		list3.display();


	}

}
