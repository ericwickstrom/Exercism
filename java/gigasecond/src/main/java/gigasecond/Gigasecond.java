package gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
	private LocalDateTime date;
	
	public Gigasecond(LocalDateTime date){
		addGigasecond(date);
	}
	
	public Gigasecond(LocalDate date){
		addGigasecond(LocalDateTime.of(date, LocalTime.MIDNIGHT));
	}
	
	private void addGigasecond(LocalDateTime date){
		this.date = date.plusSeconds(1000000000);
	}
	
	public LocalDateTime getDate(){
		return date;
	}
}
