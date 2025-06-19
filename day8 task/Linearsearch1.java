package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch1 {

	public static void main(String[] args) {
		int arr[]= {1,2,12,36,3,54,45};
		System.out.println(Arrays.toString(arr));
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to find:");
		int val=s.nextInt();
		
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("founded value:"+i+" "+val);
				flag=true;
				break;
			}
			
		}	
		if(flag!=true) {
			System.out.println("value not found");
			}
	
		
		}
}

	


