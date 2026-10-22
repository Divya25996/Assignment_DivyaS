package oct22_Keywords;

class Employer
{
	final void calculateBonus()
	{
		System.out.println("Bonus of Employee");
	}
}
class Manager extends Employer
{
	/*
	//Manager overrides final method
	void calculateBonus()
	{
		System.out.println("Bonus of Managers");
	}
	*/
}

public class Task3_EMS_UseFinalMethod {

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.calculateBonus();

	}

}
