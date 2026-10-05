package oct5;

public class findSpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1124;
		System.out.println("Enter a number : "+num);
		int sum = 0;
		int product =1;
		int org =num;
		for(;num>0;num=num/10)
		{
			int lastdigit = num%10;
			sum = sum + lastdigit;
			product = product *lastdigit;
		}
		System.out.println("Sum of digits : " +sum);
		System.out.println("Product of digits :" +product);
		if (sum == product)
			System.out.println(org + " is a spy number");
		else
			System.out.println(org + " is not a spy number");
		

	}

}
