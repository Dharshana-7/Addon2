package Stack;

import java.util.Scanner;

public class stackmenu2 {

	int stack[]=new int[5];
	int top=-1;
	
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("stack overflow");
		}
		else
		{
			stack[++top]=num;
		}
	}
	
	public void pop()
	{
		if(top<0)
		{
			System.out.println("stack underflow");
		}
		else
		{
			System.out.println(stack[top]+"popped out");
			--top;
		}
	}
	
	public void peak()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(stack[top]);
		}
	}
	
	public void display()
	{
		for(int i=0;i<stack.length;i++)
		{
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		stackmenu2 stack1=new stackmenu2();
		int data,choice;
		
		while(true)
		{
			System.out.println("enter the choice");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3 peak");
			System.out.println("4 display");
			
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter push");
				data=s.nextInt();
				stack1.push(data);
				break;
				
			case 2:
				System.out.println("enter pop");
				System.out.println("popped elements");
				stack1.pop();
				stack1.pop();
				break;
				
			case 3:
				System.out.println("enter peak");
				stack1.peak();
				break;
				
			case 4:
				System.out.println("enter display");
				stack1.display();
				break;
				
			default:
				System.out.println("invalid choice");
				
			
			}
		}

	}

}
