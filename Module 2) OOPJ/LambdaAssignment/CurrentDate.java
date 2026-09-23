import java.time.LocalDate;
import java.util.function.Supplier;
public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDate> currentDate = () -> LocalDate.now();
		
		LocalDate date = currentDate.get();
		
		System.out.println("Current Date: " + date);
	}

}
