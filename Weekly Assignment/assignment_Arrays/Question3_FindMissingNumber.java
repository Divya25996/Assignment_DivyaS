package assignment_Arrays;

public class Question3_FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 6,7,8,9};
        int n = 9;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i];
        }
        int total = n * (n + 1) / 2;
        int missing = total - sum;

        System.out.println("Missing number: " + missing);

	}

}
