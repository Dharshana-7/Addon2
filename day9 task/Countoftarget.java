package Representationstatetransfer;

public class Countoftarget {
	public static void main(String[] args) {
		
        int[] arr = {1, 2, 4, 4, 4, 5, 7};
        int target = 4;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                count++;
            else if (arr[i] > target)
                break;
        }

        System.out.println("Target " + target + " appears " + count + " times.");
    }
}

