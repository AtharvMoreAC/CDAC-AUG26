import java.util.ArrayList;
public class ArrayListAssignment {

//Question 1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		System.out.println(colors);
		
//Question 2
		colors.add(0,"Black");  // Insert "Black" at index 0 (first position)
		
		System.out.println("After inserting : " + colors);
		
//Question 3 (retrieve)
		String color = colors.get(2);
		
		System.out.println("Element at index 2: " + color);
		
//Question 4 (Update)
		colors.set(2,"Pink");
		
		System.out.println("After Updating: " + colors);
		
//Question 5 (Remove)
		colors.remove(2);
		
		System.out.println("After Removing: " + colors);
		
//Question 6 (Searching)
		if (colors.contains("Blue")) {
			System.out.println("Blue is Present");		
		}
		else {
			System.out.println("Blue is not Present");
		}
		

	}

}
