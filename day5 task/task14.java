package CircularLinkedlist;

public class task14 {
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
		newnode.next=last.next;;
		last.next=newnode;
		last=newnode;
	}
}

public void display()
{
	Node temp=last.next;
	while(temp!=last)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println(temp.data);
}
	public static void main(String[] args) {
		task14 list=new task14();
		list.insertatend(20);
		list.insertatend(30);
		list.display();

	}

}
