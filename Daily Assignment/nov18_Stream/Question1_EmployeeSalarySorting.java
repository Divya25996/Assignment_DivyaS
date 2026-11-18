package nov18_Stream;

import java.util.*;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Question1_EmployeeSalarySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1= new Employee("Rahul",50000);
		Employee obj2= new Employee("Priya",70000);
		Employee obj3= new Employee("Amit",60000);
		
		ArrayList<Employee>list = new ArrayList<Employee>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println("Ascending order based on salary");
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).
		forEach(e->System.out.println(e.name +" " + e.salary));
		
		System.out.println("\nDescending order based on salary");
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).
		reversed()).
		forEach(e->System.out.println(e.name +" " + e.salary));
		
		double totalsal = list.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("\nTotal Salary is :" +totalsal);
		
		

	}

}
