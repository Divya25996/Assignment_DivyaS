package oct22_Keywords;

final class SecurityPolicy
{
	void displayPolicy() 
	{
		System.out.println("Display Security Policy");
	}
}
class AdminPolicy extends SecurityPolicy // trying to inherit the final class
//Java does not allow a final class to be extended by another class.
{
	
}

public class Task4_EMS_UseFinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityPolicy s = new SecurityPolicy();
        s.displayPolicy();
	}

}
