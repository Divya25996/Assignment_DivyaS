package oct15_Polymorphism;

public class Question1_FindAreaCircleRectangle {
	
	static double calculateArea(int radius) 
	{
        return 3.14 * radius * radius;
    }

    static double calculateArea(int length, int breadth) 
    {
        return length * breadth;
    }
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		System.out.println("Area of Circle :" +calculateArea(5));
		System.out.println("Area of Rectangle :" +calculateArea(8,4));
		
	}

}
