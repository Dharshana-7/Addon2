package practice;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
	
	public static void remove(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		
		for(int i=1;i<=end;i++)
		{
			if(arr[start]!=arr[i])
				start++;
			arr[start]=arr[i];
		}
		
		for(int i=0;i<=start;i++) {
		System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		task6.remove(arr);
		
	}

}
