package oct8;

public class question2_SkipEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0 ;
		do
		{	
			if(num%2 == 0)
			{
				num++;
				continue;
			}
			if(num > 15)
			{
				break;
			}
			System.out.println(num);
			num++;
	
		}while(num<20);
		
		
	}

}
