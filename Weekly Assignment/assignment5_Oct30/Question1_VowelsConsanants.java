package assignment5_Oct30;

public class Question1_VowelsConsanants {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	    String str = "Programming".toLowerCase();
	    int vowels = 0;
	    int consonants = 0;
	    for (int i = 0; i < str.length(); i++) 
	    {
	        char ch = str.charAt(i);	
	        if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
	        {
	        	vowels++;
	        }
	        else if (ch >= 'a' && ch <= 'z') 
	        {
	            consonants++;
	        }
	    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
	}
}