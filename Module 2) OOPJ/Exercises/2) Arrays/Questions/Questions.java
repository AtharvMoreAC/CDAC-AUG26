public class Questions {

	// Q2 - Sort Array
	public void sortArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		for(int i = 0; i < size - 1; i++) {
			for(int j = i + 1; j < size; j++) {

				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");

		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	// Q3 - Sum Array
	public void sumArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		int sum = 0;

		for(int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum = " + sum);
	}


	// Q4 - Average Array
	public void averageArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		int sum = 0;

		for(int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}

		float average = (float)sum / size;

		System.out.println("Average = " + average);
	}


	// Q5 - Copy Array
	public void copyArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		int copy[] = new int[size];

		for(int i = 0; i < size; i++) {
			copy[i] = arr[i];
		}

		System.out.println("Copied Array:");

		for(int i = 0; i < size; i++) {
			System.out.print(copy[i] + " ");
		}
	}


	// Q6 - Maximum and Minimum
	public void maxMinArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		int max = arr[0];
		int min = arr[0];

		for(int i = 1; i < size; i++) {

			if(arr[i] > max) {
				max = arr[i];
			}

			if(arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);
	}


	// Q7 - Reverse Array
	public void reverseArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		System.out.println("Reverse Array:");

		for(int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}


	// Q8 - Duplicate Integer Values
	public void duplicateIntegerArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		System.out.println("Duplicate Values:");

		for(int i = 0; i < size; i++) {

			for(int j = i + 1; j < size; j++) {

				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}


	// Q9 - Duplicate Values
	public void duplicateArray() {

		System.out.println("Enter size:");
		int size = consoleinput.getint();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i = 0; i < size; i++) {
			arr[i] = consoleinput.getint();
		}

		System.out.println("Duplicate Values:");

		for(int i = 0; i < size; i++) {

			for(int j = i + 1; j < size; j++) {

				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}


	// Q10 - Common Elements
	public void commonElements() {

		System.out.println("Enter size of first array:");
		int size1 = consoleinput.getint();

		int arr1[] = new int[size1];

		System.out.println("Enter first array elements:");

		for(int i = 0; i < size1; i++) {
			arr1[i] = consoleinput.getint();
		}


		System.out.println("Enter size of second array:");
		int size2 = consoleinput.getint();

		int arr2[] = new int[size2];

		System.out.println("Enter second array elements:");

		for(int i = 0; i < size2; i++) {
			arr2[i] = consoleinput.getint();
		}


		System.out.println("Common Elements:");

		for(int i = 0; i < size1; i++) {

			for(int j = 0; j < size2; j++) {

				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}


	// Main Method
	public static void main(String[] args) {

		Questions obj = new Questions();

//		obj.sortArray();

//		 obj.sumArray();
//		 obj.averageArray();
		// obj.copyArray();
		// obj.maxMinArray();
		// obj.reverseArray();
		 obj.duplicateIntegerArray();
		// obj.duplicateArray();
		// obj.commonElements();
	}
}