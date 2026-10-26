public class EvendigitsElements {
	
	 static int ancount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]  arrs = {12,345,2,6,7896};
		
		 int ans =  evenDigitsElements(arrs);
		 System.out.println(ans);


	}
	
	static int evenDigitsElements (int[] arrs ) {
		
		for(int i = 0 ; i<arrs.length;i++) {
		String ss =String.valueOf(arrs[i]);
	    int count = ss.length();
	    if(count % 2 ==0 ) {
	    	ancount++;
	    }
		
			
	}
		return ancount;
	}

}
