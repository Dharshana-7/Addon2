package SinglyLinkedlist;


public class task8 {  // singlelinkedlist
	
	Node head;
		
	class Node
	{
		public int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}

		
		public void insert(int data)
		{
			Node node=new Node(data);
			
			
			if(head==null)
			{
				head=node;
				node.next=null;
			}
			else
			{
				
				node.next=head;
				head=node;
			
			}
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
		task8 list=new task8();
		list.insert(33);
		list.insert(23);
		list.insert(45);
		list.insert(89);
		
		list.show();
		

	}

}
