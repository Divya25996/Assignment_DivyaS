package assignment3_ForLoop;

public class question1_ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int reverse = 0; 
		int i = 1; // the digit
		for (; num >0 ; num = num/10) // 1234.5,123.4,12.3,1.2
		{
			i = num % 10; //5 4 3 2 1
			reverse = reverse*10 + i; //5 54 543 5432 54321
		}
		System.out.println(reverse);

	}

}
