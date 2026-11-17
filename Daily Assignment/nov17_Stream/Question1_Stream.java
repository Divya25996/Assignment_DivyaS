package nov17_Stream;
import java.util.*;
import java.util.stream.Collectors;

class Employee
{
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

public class Question1_Stream {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Amit",45000);
		Employee obj2 = new Employee("Rahul",65000);
		Employee obj3 = new Employee("Anjali",75000);
		Employee obj4 = new Employee("Priya",40000);
		
		ArrayList<Employee>list = new ArrayList<Employee>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		System.out.println("Employees earning more than 50000:");
		List<Employee>FilterList = list.stream().filter(s->s.getSalary()>50000)
				.collect(Collectors.toList());
		for(Employee obj:FilterList)
		{
			System.out.println(obj.name+" "+obj.salary);
		}
		
		
	}

}
