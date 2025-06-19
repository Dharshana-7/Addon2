package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binarsearch {
	
	public static void main(String[] args) {
	int arr[]= {1,23,45,6,78,89};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value to find in index");
	int find=s.nextInt();
	int left=0;
	int right=arr.length-1;
	int mid;
	
	while(left<right) {
		mid=(left+right)/2;
		System.out.println(mid);
		
		if(arr[mid]==find)
		{
			System.out.println("found value at"+arr[mid]+find);
			break;
		}
		
		else if(find>arr[mid])
		{
			left=mid+1;
			System.out.println("found value at"+arr[mid]+find);
		}
		
		else if(find<arr[mid])
		{
			right=mid-1;
		}
	}
	
	
	}

}
