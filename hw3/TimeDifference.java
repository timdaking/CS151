package question1;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeDifference {
	public static void main(String[] args) {
		LocalDate born = LocalDate.of(1996,  Month.OCTOBER, 14);
		ZonedDateTime currentTime = ZonedDateTime.now();
		LocalDate currentTimeNow = currentTime.toLocalDate();
		long diff = ChronoUnit.DAYS.between(born, currentTimeNow);
		
		System.out.println("Number of Days elapsed is " + diff + " days");
	}
}
