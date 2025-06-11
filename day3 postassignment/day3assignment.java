package post_assignment;
import java.util.Scanner;
public class day3assignment {
	Node head;
	class Node
	{
		public int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
		
	}
		
		
	public void insert(int data)
			{
				Node node=new Node(data);
				node.data=data;
				node.next=null;
				
				
				if(head==null)
				{
					head=node;
				}
				else
				{
					Node newnod=head;
					while(newnod.next!=null)
					{
						newnod=newnod.next;
					}
					
					newnod.next=node; 
				}
			}
	
	public void insertatany(int index,int data)
	{
		Node node=new Node(data);
		node.data=data;
		
		if (index==0) {
	        node.next=head;
	        head=node;
	        return;
		}
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}

	
	public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; i < position; i++) {
            prev = current;
            current = current.next;
            if (current == null) {
                System.out.println("Position out of range.");
                return;
            }
        }
        
        prev.next = current.next;
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
	
	
	    public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
	        day3assignment list4 = new day3assignment();

	        int choice, data, index, position;

	        while(true)
			{
				System.out.println("1. insert an array");
				System.out.println("2. insert at any position");
				System.out.println("3. delete at any position");
				System.out.println("4. exit");
				System.out.println("Enter your choice");
				choice=s.nextInt();
				
				if(choice==8)
				{
					System.out.println("existing");
					break;
				}
			
				switch(choice)
				{
				case 1:
	                System.out.print("enter data: ");
	                data=s.nextInt();
	                list4.insert(data);
	        		break;
	        		
				case 2:
	                System.out.print("enter data: ");
	                data=s.nextInt();
	                System.out.println("enter position");
	                position=s.nextInt();
	                list4.insertatany(position,data);
	        		break;
	        		
				case 3:
	                System.out.print("enter position: ");
	                position=s.nextInt();
	                list4.deleteAtPosition(position);
	                break;
	                
				case 4:
	                list4.display();
	                break;
	                
				default:
	                System.out.println("Invalid choice.");
				}
	        
	      
	    }
	    }
}

	

