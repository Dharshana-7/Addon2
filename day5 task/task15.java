package CircularLinkedlist;

public class task15 {
	Node last;
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	task15()
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
			task15 list=new task15();
			list.insertatend(1);
			list.insertatend(2);
			list.insertatend(3);
			list.insertatend(4);
			list.display();
		}

	}

	


