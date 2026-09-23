import java.util.function.Function;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {45,63,7,18,10};
		
		Function<int[],int[]> reverse = (arr) -> {
			int[] reversed = new int[arr.length];
			for(int i = 0; i < arr.length; i++) {
				reversed[i] = arr[arr.length - 1 - i];
			}
			return reversed;
			
		};
		int[] result = reverse.apply(numbers);
		
		for(int number : result) {
			System.out.println(number + " ");
		}

	}

}
