import java.util.Comparator;
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Lambda expression to sort a string array in alphabetical order.
		
		String[] names = {"Rohit","Virat","Surya","Rahul","Dhoni"};
		
		Comparator<String> comparator = (a, b) -> a.compareTo(b);
		
		java.util.Arrays.sort(names, comparator);
		
		for (String name : names) {
			System.out.println(name);
		}	

	}

}
