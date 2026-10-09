package oct9;

public class question1_FindEvenOddNumberCount_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num = {11, 24, 35, 42, 56, 67, 80, 93};
		int evencount =0;
		int oddcount = 0;
		for (int i =0; i<num.length; i++)
		{
			if (num[i] % 2 ==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}	
		System.out.println("Even number count : " +	evencount);
		System.out.println("Odd number count : " +	oddcount);
	}

}
