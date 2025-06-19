package post_assignment;

public class day6assignment {
	
	Node top;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

	day6assignment()
	{
		top=null;
	}

	public void push(int data)
	{
		Node newnode=new Node(data);
		if(top==null)
		{
			top=newnode;
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}

	public void pop()
	{
		if(top==null)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int tmp=top.data;
			top=top.next;
			System.out.println("popped data "+tmp);
		}
	}

	public void peak()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("peak "+ top.data);
		}
	}

	public void display()
	{
		Node node=top;
		
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
		public static void main(String[] args) {
			day6assignment stack=new day6assignment();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.display();
			System.out.println();
			
			stack.pop();
			stack.pop();
			stack.display();
			System.out.println();
			
			stack.peak();
			

		}


}
