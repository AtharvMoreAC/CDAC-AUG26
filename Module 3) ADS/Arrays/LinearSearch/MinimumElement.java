public class MinimumElement {
	public static void main(String[] args) {
		int[] arr = {12,34,23,5,53,77,3};
		int ans = Min(arr);
		System.out.println(ans);
	}
	static int min = 0 ;
	
	static int Min(int[] arrs) {
		if(arrs.length < 0) {
			return -999999;
		}
		
		for(int i = 0 ; i <arrs.length;i++) {
			if(arrs[i]<arrs[min]) {
				 arrs[min]= arrs[i];
			}
		}
		return arrs[min];
	}

}
