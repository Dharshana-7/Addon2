package practice;

import java.util.Scanner;


public class task2 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the no of elememts");
		int size=s.nextInt();
		
		int[] arr= new int[size]; 
		for(int j=0;j<size;j++) {
		arr[j]=s.nextInt();
		}
	
		int min=arr[0];
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<min)
			{
				min=arr[i];
				System.out.println("minimum"+min);
			}
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.println("maximum"+max);
			}
		}
		
	
		}
	}

