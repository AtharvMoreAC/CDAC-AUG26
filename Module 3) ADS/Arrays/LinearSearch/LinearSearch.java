public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {2,43,21,4,24,2};
		int target = 24;
		int result = linearSearch(arr,target);
		System.out.println(result);
		
		
	}
	static int linearSearch(int[] arrs,int t) {
		if (arrs.length < 0) {
			return -1;
		}
		for(int  i = 0 ; i < arrs.length ; i++) {
			if(arrs[i] == t) {
				return i;
			}
		
		}
		
		/*
		 * // for (int aa : arrs) { // if (aa == t) { // return aa; // } // }
		 */		
		return -1;
		
	}

}
