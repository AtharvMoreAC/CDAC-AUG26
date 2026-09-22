import java.util.function.Function;
public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {18,45,1,7,93};
		
		Function<int[], Integer> largest = (arr) -> {
			int max = arr[0];
			
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		};
		
		int result = largest.apply(numbers);
		
		System.out.println("Largest number:" + result);
	}

}