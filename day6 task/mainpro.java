package Stack;

public class mainpro {
	int queue[]=new int[5];
	
	 
	int rear=-1;
	int front=-1;
	
	public void enque(int num)
	{
		if(rear==4)
		{
			System.out.println("queue overflow");
		}
		else
		{
			queue[++rear]=num;
		}
	}
	
	public void deque()
	{
		if(front==4)
		{
			System.out.println("queue empty");
		}
		else
		{
			queue[++front]=0;
		}
	}
	
	public void display()
	{
		for(int i=0;i<queue.length;i++)
		{
			System.out.println(queue[i]);
		}
	}
	public static void main(String[] args) {
		mainpro q1=new mainpro();
		q1.enque(10);
		q1.enque(20);
		q1.enque(30);
		q1.enque(40);
		q1.enque(50);
		q1.display();
		System.out.println();
		q1.deque();
		q1.display();

	}

}


