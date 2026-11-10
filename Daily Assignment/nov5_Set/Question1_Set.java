package nov5_Set;
import java.util.*;
public class Question1_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        System.out.println("Unique Elements: " + uniqueNumbers);
        System.out.println("Total Unique Elements: " + uniqueNumbers.size());

	}

}
