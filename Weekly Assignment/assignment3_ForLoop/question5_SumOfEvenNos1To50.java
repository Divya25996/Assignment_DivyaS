package assignment3_ForLoop;

public class question5_SumOfEvenNos1To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int num =1; num <=50;num++)
			if(num%2 ==0)
				sum = sum+num;
		System.out.println("Sum of Even numbers : " +sum);		

	}

}
