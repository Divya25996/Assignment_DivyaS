package nov2_AbstractClass;

abstract class Employee
{
    int employeeId;
    String employeeName;

    abstract double calculateSalary();

    void displayDetails()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee
{
    double monthlySalary;

    FullTimeEmployee(int id, String name, double salary)
    {
        employeeId = id;
        employeeName = name;
        monthlySalary = salary;
    }

    double calculateSalary()
    {
        return monthlySalary;
    }

    void displayDetails()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee
{
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hours, double rate)
    {
        employeeId = id;
        employeeName = name;
        hoursWorked = hours;
        hourlyRate = rate;
    }

    double calculateSalary()
    {
        return hoursWorked * hourlyRate;
    }

    void displayDetails()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}
public class Question1_AbstractClass{
	public static void main(String[] args)
    {
        FullTimeEmployee f1 = new FullTimeEmployee(101, "Rahul", 50000);

        PartTimeEmployee p1 = new PartTimeEmployee(102, "Amit", 80, 300);

        System.out.println("Full-Time Employee Details");
        f1.displayDetails();

        System.out.println();

        System.out.println("Part-Time Employee Details");
        p1.displayDetails();
    }
}