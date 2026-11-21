package assignment_Nov20StreamAPI;
import java.util.*;
import java.util.stream.Collectors;



class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}


public class Question1_StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee("Rahul", "IT", 60000);
		Employee E2 = new Employee("Priya", "HR", 45000);
		Employee E3 = new Employee("Amit", "IT", 75000);
		Employee E4 = new Employee("Neha", "Finance", 55000);
		Employee E5 = new Employee("Karan", "IT", 60000);
		Employee E6 = new Employee("Simran", "HR", 50000);
		Employee E7 = new Employee("Rohit", "Finance", 75000);
		Employee E8 = new Employee("Ankit", "IT", 40000);
		
		List<Employee> employees = Arrays.asList(E1,E2,E3,E4,E5,E6,E7,E8);
	
		
		// QUESTION 1
		System.out.println("EMPLOYEES EARNING MORE THAN 50000");
		List<Employee>FilterList = employees.stream().filter(e->e.getSalary()>50000)
				.collect(Collectors.toList());
		for(Employee E:FilterList)
		{
			System.out.println(E.getName());
		}
		
		//QUESTION 2
		
		System.out.println("\nEMPLOYEES WORKING IN IT DEPARTMENT");
		employees.stream().filter(e -> e.getDepartment().equals("IT"))
	    .map(e -> e.getName())
	    .forEach(name -> System.out.println(name));
		
		//QUESTION 3
		
		System.out.println("\nSORT EMPLOYEE BY SALARY IN ASCENDING ORDER");
		employees.stream().sorted((a,b) -> Integer.compare(a.getSalary(), b.getSalary()))
	    .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
		
		//QUESTION 4
		System.out.println("\nUNIQUE SALARIES IN ASCENDING ORDER ");
		employees.stream().map(e->e.getSalary()).distinct().sorted()
		.forEach(salary->System.out.println(salary));
		
		//QUESTION 5
		System.out.println("\nEMPLOYEES SALARY GREATER THAN 50000, REMOVE DUPLICATE AND SORT");
		employees.stream().filter(e->e.getSalary()>=50000).map(e -> e.getDepartment()).distinct().sorted()
		.forEach(department->System.out.println(department));
	}
}
