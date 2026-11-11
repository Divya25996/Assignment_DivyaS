package nov11;
import java.util.*;
class Student
{
	int rollNo;
	String name;
	String course;
	Student(int rollNo,String name,String course)
	{
		this.rollNo=rollNo;
		this.name= name;
		this.course= course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, name,rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
}

public class Question1_SetHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student(101,"Rahul","Java");
		Student S2 = new Student(102,"Priya","Python");
		Student S3 = new Student(101,"Rahul","Java");
		Student S4 = new Student(103,"Amit","Java");
		Student S5 = new Student(102,"Priya","Java");
		Student S6 = new Student(101,"Rahul","Selenium");
		
		Set <Student>Students = new HashSet<Student>();
		Students.add(S1);
		Students.add(S2);
		Students.add(S3);
		Students.add(S4);
		Students.add(S5);
		Students.add(S6);
		
		for(Student S:Students)
		{
			System.out.println("Student{rollNo=" + S.rollNo + ", name='" + S.name +"', course='" + S.course + "'}");        
		}
		System.out.println("Size of set is :" +Students.size());
	}

}
