package oct5;

public class findMagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 172;
		System.out.println("Enter a number : "+num);
		int sum = 0;
		int sum1 =0;
		int org = num ;
		for (;num>0;num =num/10)
		{
			int lastdigit = num%10;
			sum = sum+lastdigit;
		}
		System.out.println("Digit sum = " +sum);
		for (; sum >= 10; ) 
		{
	        for (; sum > 0; sum = sum / 10) 
	        {
	            int lastdigit1 = sum % 10;
	            sum1 = sum1 + lastdigit1;
	        }
		sum = sum1;
        }	
		System.out.println("Final digit = "+sum);
		if(sum ==1)
			System.out.println(org+ " is a magic number");
		else
			System.out.println(org+ " is not magic number");

	}

}
