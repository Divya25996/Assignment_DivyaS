package oct9;

public class question2_FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num ={10, 20, 30, 20, 40, 10, 50, 30, 60};
		System.out.print("Duplicate Elements : ");
		{
		for(int i =0; i<num.length; i++)
			for(int j =0; j<i;j++)
			{
				if(num[i] == num[j])
				{
					System.out.print(num[i] +" ");
					break;
				}
			}
		}				
	}

}
