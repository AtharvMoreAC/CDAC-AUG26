import java.util.TreeSet;

public class TreeSetAssignment {

	public static void main(String[] args) {
		
//Question 11 (Create a new TreeSet, add some colors (String), and print the TreeSet.)
		
		TreeSet<String> colors = new TreeSet<>();
		
		colors.add("Red");
		colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        System.out.println(colors);
        System.out.println();
        
//Question 12 (adding all elements of one TreeSet to another TreeSet.)
        
        TreeSet<String> colors2 = new TreeSet<>();
        
        colors2.add("Black ");
        colors2.add("Yellow");
        
        System.out.println("1st TreeSet : " + colors);
        System.out.println("2nd TreeSet before adding : " + colors2);
        
        colors2.addAll(colors);
        
        System.out.println("2nd TreeSet after adding : " + colors2);
        System.out.println();
        
//Question 13 (reverse-order)
        System.out.println("Normal order : " + colors);
        
        TreeSet<String> reverseColors = new TreeSet<>(colors.descendingSet());
        
        System.out.println("Reverse order : " + reverseColors);
        System.out.println();
        
//Question 14 (Get the first and last elements)
        System.out.println("TreeSet : " + colors);
        
        String firstColor = colors.first();
        String lastColor = colors.last();
        
        System.out.println("First Element : " + firstColor);
        System.out.println("Last Element : " + lastColor);
        System.out.println();
        
//Question 15 (Write a Java program to get the element in a TreeSet which is greater than or equal to the given element.
        //Hint: Use the ceiling() method of TreeSet.)
        
        System.out.println("TreeSet : " + colors);
        
        String result = colors.ceiling("Orange");
        
        System.out.println("Element greater than or equal to Orange : " + result);
   
	}

}
