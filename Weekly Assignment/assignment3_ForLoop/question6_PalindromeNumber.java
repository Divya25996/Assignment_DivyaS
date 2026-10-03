package assignment3_ForLoop;

public class question6_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221;
		int reverse = 0;
		int num1 = 1;
		int orginal = num;
		for (;num>0;num = num/10)
		{
			num1 = num%10;
			reverse = reverse *10 + num1;
		}
		if (orginal == reverse)
		{
			System.out.println(reverse + " is palindrome");
		}
		else
		{
			System.out.println(reverse +" is not palindrome");
		}
		
			
	}

}
