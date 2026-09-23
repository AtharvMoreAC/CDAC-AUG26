import java.util.function.BiFunction;
public class ConcatenateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String,String,String> concatenate = (str1, str2) -> str1 + str2;
			
		String first = "Java";
		String second = " is Difficult.";
		
		String result = concatenate.apply(first, second);
		
		System.out.println("Concatenated String : " + result);
		
	}

}
