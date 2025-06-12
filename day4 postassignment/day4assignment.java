package post_assignment;

import java.util.Scanner;

public class day4assignment {
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public void insert(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	
	public void traverseforward()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void traversebackward() {
		Node current=tail;
        while (current!=null) 
        {
            System.out.println(current.data);
            current=current.prev;
        }
    }
	
	public void insertAtMiddle(int data) {
        Node n = new Node(data);
        if (head == null) { head = n; return; }

        int count = 0;
        for (Node t = head; t != null; t = t.next) 
        	count++;

        Node t = head;
        for (int i = 0; i < count / 2; i++) 
        	t = t.next;

        n.prev = t.prev;
        n.next = t;

        if (t.prev != null) t.prev.next = n;
        else head = n;

        t.prev = n;
    }
	
	public void deleteatMiddle() {
        int c = 0;
        for (Node t = head; t != null; t = t.next) c++;

        Node t = head;
        for (int i = 0; i < c / 2; i++) t = t.next;

        if (t.prev != null) t.prev.next = t.next;
        if (t.next != null) t.next.prev = t.prev;
        if (t == head) head = t.next;
    }
	
	public void display()
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
		 Scanner sc = new Scanner(System.in);
		day4assignment list=new day4assignment();
		int choice, data;
		
		while(true)
		{
			System.out.println("1. insert");
			System.out.println("2. insertatmiddle");
			System.out.println("3. deleteatmiddle");
			System.out.println("4. traverseforward");
			System.out.println("5. traversebackward");
			System.out.println("6. display");
			
			choice = sc.nextInt();

			
            switch (choice) {
                case 1:
                	System.out.print("enter data");
                    data= sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter data");
                    data=sc.nextInt();
                    list.insertAtMiddle(data);
                    break;
                case 3:
                    list.deleteatMiddle();
                    break;
                case 4:
                    list.traverseforward();
                    break;
                case 5:
                    list.traversebackward();
                    break;
                case 6:
                    list.display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
		}
		

	}
}
