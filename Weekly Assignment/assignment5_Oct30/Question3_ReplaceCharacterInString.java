package assignment5_Oct30;

public class Question3_ReplaceCharacterInString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String str = "banana";
        char oldChar = 'a';
        char replacechar = 'o';
        String result = "";
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);

            if (ch == oldChar) 
            {
                result = result + replacechar;
            }
            else
            {
                result = result + ch;
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("New String: " + result);
	}

}
