package assignment_Exception13Nov;
import java.util.*;

public class Question2_StudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []marks = new int[5];
		int total =0;
		double average;
		try 
		{
            System.out.println("Enter marks of 5 subjects:");

            for (int i = 0; i < 5; i++) 
            {
                marks[i] = sc.nextInt();
                total = total + marks[i];
            }

            average = total / 5.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
        }
		catch (Exception ex){
			System.out.println("Invalid input! Please enter integer marks.");
		}
		finally {
            System.out.println("Marks calculation process completed");
		}

	}

}
