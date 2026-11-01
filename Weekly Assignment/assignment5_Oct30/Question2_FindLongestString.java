package assignment5_Oct30;

public class Question2_FindLongestString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Java programming is interesting";
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) 
        {
            if (word.length() > longest.length()) 
            {
                longest = word;
            }
        }
	        System.out.println("Longest Word: " + longest);
	}

}
