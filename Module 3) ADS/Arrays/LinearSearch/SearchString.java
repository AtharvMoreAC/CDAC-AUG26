public class searchString {
	public static void main(String[] args) {
		String name = "sarthak";
		char target = 'r';
		int ans = stringLinearSearch(name , target);
		System.out.println(ans);

		
	}
	static int stringLinearSearch(String nn ,char t ) {
		if (nn.length() < 0) {
			return -1;
		}
		for (int i = 0 ;i <nn.length() ; i++) {
			if (t == nn.charAt(i)) {
				return i;
			}
		}
	
		return -1;
	}

}
