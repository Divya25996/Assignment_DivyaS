package oct26_StaticKeyword;

class Student 
{
	int rollNumber;
	String  name;
	static String collegeName = "ABC Engineering College";
	static int studentCount=0;
	static 
	{
        System.out.println("Student class initialized.");
	}
	Student(int rollNumber,String name)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		studentCount++;
	}
	static void changeCollegeName(String newCollegeName) 
	{
		collegeName= newCollegeName;
		System.out.println("College name updated successfully.");

	}
	 void displayDetails() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + name);
	        System.out.println("College: " + collegeName);
	 
	 }
	 static void displayStudentCount() 
	 {
	        System.out.println("Total Students: " + studentCount);
	 }
}

public class Question1_StaticManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student(101,"Rahul");
        Student obj2 = new Student(102, "Priya");
        Student obj3 = new Student(103, "Amit");

        // To Display student details
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();

        // total number of students
        Student.displayStudentCount();

        // Change college name 
        Student.changeCollegeName("XYZ Institute of Technology");

        // Display updated student details
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();

        // Display total number of students again
        Student.displayStudentCount();
	}

}





