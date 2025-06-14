package Stack;

public class stackpush1 {
	int mystack[]=new int[5];
	int top=-1;
	
	public void push(int num) {
	if(top==4)
	{
		System.out.println("stack overflow");
	}
	else
	{
		mystack[++top]=num;
	}
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow");
		}
		return mystack[top--];
	}
	public int peak()
	{
		if(top==-1)
		{
			System.out.println("stack empty");
		}
		return mystack[top];
	}
	
	
	public void display()
	{
		for(int i=0;i<=mystack.length-1;i++)
		{
			System.out.println(mystack[i]);
		}

	}
	
	 
	public static void main(String[] args) {
		stackpush1 stack=new stackpush1();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		
		System.out.println("poped"+stack.pop());
		System.out.println("poped"+stack.pop());
		System.out.println();
		System.out.println("peak"+stack.peak());
		
		

}
}