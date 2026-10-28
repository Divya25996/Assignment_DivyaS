package oct27_Scanner;
import java.util.Scanner;

public class question1_SumofThreeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) 
        {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum:" + sum);
	}

}
