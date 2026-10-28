package oct28_Wrapper;

public class Question1_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha ='7';
		if(Character.isDigit(alpha)) 
			System.out.println("It is a Digit");
		else
			System.out.println("Not a digit");
		
		char letter ='A';
		if(Character.isLetter(letter)) 
			System.out.println("Its a Letter");
		else
			System.out.println("Not a letter");
		
		char lettercase ='b';
		System.out.println("Upperacase : " +Character.toUpperCase(lettercase));

	}
}
