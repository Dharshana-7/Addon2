package CircularLinkedlist;

public class task16 {
	Node last;
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	task16()
	{
		last=null;
	}
	
	public void insertatend(int data)
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
			last=newnode;
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
		task16 list2=new task16();
		
		list2.insertatend(10);
		list2.insertatend(20);
		list2.insertatend(30);
		list2.insertatend(40);
		list2.insertatend(50);
		list2.display();
		System.out.println();
	
		
		list2.deleteatbegin();
		System.out.println("after deletion at begin");
		list2.display();
	}

}


