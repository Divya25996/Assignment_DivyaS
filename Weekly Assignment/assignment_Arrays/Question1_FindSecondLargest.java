package assignment_Arrays;

public class Question1_FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 45, 7, 89, 34, 89, 56};
        int largest = arr[0];
        int second = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > largest) 
            {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < largest)
            	if(arr[i] > second) 
            	{
            		second = arr[i];
            	}
        }
        System.out.println("Second largest element: " + second);
	}
}
