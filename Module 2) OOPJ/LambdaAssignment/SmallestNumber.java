import java.util.function.Function;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {18,45,1,7,93};
		
		Function<int[], Integer> smallest = (arr) -> {
			int min = arr[0];
			
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		};
		
		int result = smallest.apply(numbers);
		
		System.out.println("Smallest number:" + result);

	}

}
