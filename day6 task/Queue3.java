package Stack;

public class Queue3 {
	
		Node front;
		Node rear;
		class Node{
			int data;
			Node next;
			
			Node(int data)
			{
				this.data=data;
				
			}
		}
		
		Queue3()
		{
			front=null;
			rear=null;
		}
		
		public void enque(int data)
		{
			Node newnode=new Node(data);
			if(front==null)
			{
				front=newnode;
				rear=newnode;
			}
			else
			{
				rear.next=newnode;
				rear=newnode;
			}
		}
		
		public void deque()
		{
			if(front==null)
			{
				System.out.println("queue empty");
			}
			else {
				//int temp=front.data;
			front=front.next;
			//System.out.println(temp);
			}	
			
		}
		public void display()
		{
			Node node=front;
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		}
		public static void main(String[] args) {
			Queue3 q1=new Queue3();
			q1.enque(10);
			q1.enque(20);
			q1.enque(30);
			q1.enque(40);
			q1.enque(50);
			q1.display();
			System.out.println();
			q1.deque();
			q1.deque();
			q1.display();

		}

	}


