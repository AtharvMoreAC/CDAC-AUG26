
public class ArrayZeroEnd {

	public static void main(String[] args) {
		
		int[] arr = {0, 5, 0, 3, 8, 0, 2};
		
		int pos = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		
		while (pos < arr.length) {
			arr[pos] = 0;
			pos++;
		}
		
		System.out.print("Output: [");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("]");

	}

}
