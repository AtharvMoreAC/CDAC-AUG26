public class SecondLargeArray {

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 8, 20, 15, 20, 7};
		
		if(arr.length < 2) {
			System.out.println("Second largest does not exist");
			return;
		}
		
		int largest = arr[0];
		int secondLargest = 0;
		boolean found = false;
		
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				found = true;
			}
			else if (arr[i] < largest) {
				
				if(!found || arr[i] > secondLargest) {
					secondLargest = arr[i];
					found = true;
				}
			}
		}
		
		if(found) {
			System.out.println("Second Largest = " + secondLargest);
		}
		else {
			System.out.println("Second largest does not exist");
		}

	}

}
