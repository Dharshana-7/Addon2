package SinglyLinkedlist;

public class mainpro3 {
	Node head;

	class Node
	{
		int data;
		Node next;
		Node prev;
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
		void reverseList() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }

	        head = prev;
	        System.out.println("list reversed");
	    }
		
		public void show()
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
		mainpro3 listr=new mainpro3();
		listr.insert(10);
		listr.insert(20);
		listr.insert(30);
		
		listr.reverseList();
		listr.show();

	}

}
