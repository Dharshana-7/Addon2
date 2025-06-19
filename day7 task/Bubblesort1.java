package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort1 {

	public static void Bublesort(int arr[])
	{
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
			{
				for(int start=0;start<arr.length-i-1;start++)
				{
				if(arr[start]>arr[start+1])
					{
					int temp=arr[start];
					arr[start]=arr[start+1];
					arr[start+1]=temp;
					
					}
			}
					
		}
		
		
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Bublesort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
