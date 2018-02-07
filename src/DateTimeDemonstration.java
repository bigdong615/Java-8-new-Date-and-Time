import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeDemonstration {

	public static void main(String[] args) {
		 LocalDate localDate = LocalDate.now();
		System.out.println("The local date is :: " + LocalDate.now());
		System.out.println("The local date is :: " + new Date());
		
		  LocalTime localTime = LocalTime.now();
		   System.out.println(localTime);
		  //Get the hour of the day
		  System.out.println("The hour of the day:: " + localTime.getHour());
		  //add 2 hours to the time.
		  System.out.println(localTime.plus(2, ChronoUnit.HOURS));
		  //add 6 minutes to the time.
		  System.out.println(localTime.plusMinutes(6));
		  //substract 2 hours from current time
		  System.out.println(localTime.minus(2, ChronoUnit.HOURS));
	}

}
