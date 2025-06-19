package post_assignment;

public class day9assignment {
	public void lowerbound()
	{
		int arr[]= {2,3,4,5,12,35,77};
		int target=356;
		int left=0;
		int right=arr.length;
		int mid;
		while(left<right)
		{
			mid=(left+right)/2;

			if(arr[mid]<target)
			{

				left=mid+1;

			}

		}

			try
			{
				if(((arr[left])|(arr[right]))>=target)
				{
					System.out.println("Low bound found ");
				}

				else if(target>(arr[left]|arr[right]))
				{
					System.out.println("Out of bounds");
				}
				
			}

			catch(Exception e)
			{
				System.out.println("out of bounds,no low bound!!");
			}

		}

public void upperbound()
{
	int[] arr = {1, 2, 4, 4, 5, 7};
    int target = 4;

    int left = 0;
    int right = arr.length;
    int upperBoundIndex;

    while (left < right) {
        int mid = (left + right) / 2;
        if (arr[mid] <= target) {
        	left = mid + 1;
        } 
        else {
        	right = mid;
        }
    }

    upperBoundIndex = left;

    if (upperBoundIndex < arr.length) {
        System.out.println("Upper bound of " + target + "at index: " + upperBoundIndex + ", value: " + arr[upperBoundIndex]);
    } else {
        System.out.println("Upper bound of " + target + " is out of array bounds");
    }
}

	public static void main(String[] args) {
		day9assignment a1=new day9assignment();
		a1.lowerbound();
		a1.upperbound();
		
		

	}
}
