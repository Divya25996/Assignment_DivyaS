package oct6;

public class question4_butterflypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int star =1;star<=row;star++)
				System.out.print("*");
			for(int space=1;space<=10-2*row;space++)
				System.out.print(" ");
			for(int star=1;star<= row;star++)
				System.out.print("*");
			System.out.println();
		}
		for(int row=1;row<=4;row++)
		{
			for(int star=1;star<=5-row;star++)
				System.out.print("*");
			for(int space=1;space<=2*row;space++)
				System.out.print(" ");
			for(int star=1;star<= 5-row;star++)
				System.out.print("*");
			System.out.println();
		}
	}

}
