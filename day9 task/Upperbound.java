package Representationstatetransfer;

public class Upperbound {
	public static void main(String[] args) {
    	
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
            System.out.println("Upper bound of " + target + " is at index: " + upperBoundIndex + ", value: " + arr[upperBoundIndex]);
        } else {
            System.out.println("Upper bound of " + target + " is out of array bounds");
        }
    }
}
