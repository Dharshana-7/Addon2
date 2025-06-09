package practice;

import java.util.Scanner;

public class task7 {

	public static void palindrome(String word) 
	{
	char arr[]=word.toCharArray();
	
	
	int end=arr.length-1;
	
	for(int start=0;start<end;) {
	if(arr[start]!=(arr[end])) {
		
		System.out.println("not a palindrome");
		return;
}
	
	start++;
	end--;
	
	}
	System.out.println("palindrome");
}
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	String word=s.nextLine();
	
	task7.palindrome(word);
		

	}
}

