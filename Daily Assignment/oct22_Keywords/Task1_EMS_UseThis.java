package oct22_Keywords;

class Employee
{
	int employeeId;
	String employeeName;
	double Salary; 
	Employee(int employeeId,String employeeName,double Salary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.Salary = Salary;	
		
	}
	void displayDetails() 
	{
        System.out.println("Employee ID: " + employeeId +", " +"Employee Name: " + employeeName+", "+"Salary: " + Salary );    
	}
}
public class Task1_EMS_UseThis 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Divya",100000.00);
		Employee emp2 = new Employee(102,"Sankar",200000.00);
		emp1.displayDetails();
		emp2.displayDetails();
		

	}


}
