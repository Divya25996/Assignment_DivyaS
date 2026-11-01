package assignment5_Oct30;

public class Question4_SubstringsOfString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 String str = "ABC";
	 for (int i = 0; i < str.length(); i++) 
	 {
            String result = "";
            for (int j = i; j < str.length(); j++) 
            {
                result = result + str.charAt(j);
                System.out.println(result);
            }
        }
	}
}
