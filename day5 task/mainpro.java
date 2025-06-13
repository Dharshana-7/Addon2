package CircularLinkedlist;

public class mainpro {
	Node last;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	mainpro(){
		last=null;
	}

	public void insertatbegin(int data)
	{
		Node newnode=new Node(data);
		
		
		if(last==null)
		{
			
			last=newnode;
			newnode.next=last;
		}
		else
		{
			newnode.next=last.next;
			last.next=newnode;
			
		}
		
	}
	
	public void deleteatbegin()
	{
		if(last==null)
		{
			System.out.println("empty list");
		}
		if(last.next==last)
		{
			last=null;
		}
		else
		{
			last.next=last.next.next;
		}
	}
	
	public void deleteAtPosition(int pos) {
	    if (last == null || pos < 1) return;

	    if (pos == 1) {
	        deleteatbegin();
	        return;
	    }

	    Node temp = last.next;
	    for (int i = 1; i < pos - 1 && temp.next != last.next; i++) 
	    {
	        temp = temp.next;
	    }

	    if (temp.next == last.next) return;
	    if (temp.next == last) last = temp;

	    temp.next = temp.next.next;
	}

	public void display()
	{
		Node node=last.next;
		while(node!=last)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data+" ");
	}

	public static void main(String[] args) {
		mainpro list=new mainpro();
		list.insertatbegin(10);
		list.insertatbegin(20);
		list.insertatbegin(30);
		list.insertatbegin(40);
		list.display();
		
		list.deleteAtPosition(2);
		System.out.println();
		list.display();
	}

}


