import java.util.function.Supplier;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> randomNumber = () -> {
			return (int)(Math.random() * 900) + 100;
		};
		int result = randomNumber.get();
		
		System.out.println("Random 3 digit number : " + result);
	}

}
