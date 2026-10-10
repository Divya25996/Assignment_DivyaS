package assignment_Arrays;

public class Question2_MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 5, 0, 3, 8, 0, 2, 9};
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != 0) 
            {
                System.out.print(arr[i] + " ");
            }
        }

        // Print zeros
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == 0) 
            {
                System.out.print(arr[i] + " ");
            }
        }
	}

}
