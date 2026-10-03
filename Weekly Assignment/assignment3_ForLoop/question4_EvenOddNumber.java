package assignment3_ForLoop;

public class question4_EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers :");
		for (int num =1; num<=20; num++)
			if(num%2 ==0)
			{
				System.out.print(num+" ");
			}				
		System.out.println("\nOdd Numbers : ");
		for (int num =1;num<=20;num++)
			if(num%2 !=0)
			{
				System.out.print(num+" ");
			}
	}

}
