package oct22_Keywords;
class Company
{
	final String COMPANY_NAME = "Tech Solutions Pvt. Ltd";
	final  int MAX_EMPLOYEES =100;

	void displayDetails() 
	{
		System.out.println("Company name : "+COMPANY_NAME);
		System.out.println("Max employees : "+MAX_EMPLOYEES);
	}
}


public class Task2_EMS_UseFinal 
{

	public static void main(String[] args) 
	{
		Company obj = new Company();
		obj.displayDetails();
		
		// Trying to change a final variable
		//obj.COMPANY_NAME = "ABC Technologies";
       // obj.MAX_EMPLOYEES = 200;
		
	}

}
