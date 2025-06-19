package practice;

public class recursion {
	
	public static int name(int num)
	{
		if(num==0)
		{
			return 0;
		}
		return num+name(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name(10));
	}

}
