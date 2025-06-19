package practice;

import java.util.Arrays;
public class task4 {
	
	public static void reversearray(int arr[]) {
	
	
	int left=0;
	int right=arr.length-1;
	
	System.out.println(Arrays.toString(arr));
	
	while(left<right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		left++;
		right--;
	}
	System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[]) {
		int arr[]= {4,2,10,7,5,3,8};
		Arrays.sort(arr);  // sorts in ascending order
		
		reversearray(arr); // reverse the array in ascending to decending
		
		System.out.println("Arrays in decending: "+ Arrays.toString(arr));
		
		
	}

}


