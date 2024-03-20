import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		LocalDate dob = LocalDate.of(2001, 02, 01);
		System.out.println(dob);
		
		LocalDate dateOFPassing  = LocalDate.of(2001, Month.JUNE, 2);
		System.out.println(dateOFPassing);
		
		LocalDate todaysDate = LocalDate.now();
		LocalDate afterDays = todaysDate.plusDays(20);
		System.out.println(afterDays);
		
		
		
	}

}
