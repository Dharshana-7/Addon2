package practice;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
	
public static void decending(int num[]) {
		
		int start=0;
		int end=num.length-1;

		System.out.println(Arrays.toString(num));

		while(start<end)
		{

			int a=num[end];
			num[end]=num[start];
			num[start]=a;

			start++;
			end--;

		}
		System.out.println(Arrays.toString(num));
		}

		public static void main(String args[]) {

			Scanner s=new Scanner(System.in);

			System.out.println("enter size: ");
			int size=s.nextInt();
			int num[]=new int[size];

			for(int i=0;i<size;i++)

			{
				num[i]=s.nextInt();
			}
		
		Arrays.sort(num);
		decending(num); 

		System.out.println("Arrays in decending: "+ Arrays.toString(num));

}
}