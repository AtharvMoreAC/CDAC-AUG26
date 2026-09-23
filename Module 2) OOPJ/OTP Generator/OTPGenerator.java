import java.util.function.Supplier;
public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels = "AEIOU";
		
		Supplier<String> otp = () -> {
			char first = vowels.charAt((int)(Math.random() * 5));
			
			String result = " " + first;
			
			for(int i = 0; i < 4; i++) {
				int digit = (int)((Math.random() * 10 ));
				
				result = result + digit;
			}	
				return result;
			
		};
		String result = otp.get();
		
		System.out.println("Generated OTP: " + result);

	}

}
