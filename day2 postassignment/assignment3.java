package post_assignment;

public class assignment3 {

	public static void main(String args[]) {
	int arr[]= {4,5,2,6,9,10};
	int start=1;
	int end=arr.length-1;
	int temp=0;
	for(int i=0;i<end;i++)
	{
		temp=arr[start]+arr[i];
		start++;
		end--;
		
	}
	System.out.println(temp);
		
}
}