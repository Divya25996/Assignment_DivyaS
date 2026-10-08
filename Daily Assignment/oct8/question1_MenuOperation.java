package oct8;

public class question1_MenuOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 3;
		int a = 20;
		int b = 5;
		do
		{
			switch (choice)
			{
				case 1: 
					System.out.println("Addition = " +(a+b));
					break;
				case 2: 
					System.out.println("Subtraction = "+(a-b));
					break;
				case 3: 
					System.out.println("Multiplication = " +(a*b));
					break;
				case 4: 
					System.out.println("Division = " +(a/b));
					break;
				case 5: 
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid");
			}
			choice =5;
		}while(choice != 5);
		
	}

}
