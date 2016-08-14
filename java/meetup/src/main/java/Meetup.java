import java.util.Arrays;

import org.joda.time.DateTime;

public class Meetup {
	public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
	
	private int mMonth, mYear;
	
	public Meetup(int month, int year){
		mMonth = month;
		mYear = year;
	}
	
	public DateTime day(int day, MeetupSchedule dayInMonth){
		int current = 1;
		int count = 1;
		int[] thirty = {4, 6, 9, 11};
		int[] thirtyOne = {1, 3, 5, 7, 8, 10, 12};
		if(!dayInMonth.equals(MeetupSchedule.TEENTH)){
			if(dayInMonth.equals(MeetupSchedule.FIRST)){
				count = 1;
			} else if(dayInMonth.equals(MeetupSchedule.SECOND)){
				count = 2;
			} else if(dayInMonth.equals(MeetupSchedule.THIRD)){
				count = 3;
			} else if(dayInMonth.equals(MeetupSchedule.FOURTH)){
				count = 4;
			} else {
				if(Arrays.binarySearch(thirtyOne, mMonth) > -1){
					current = 25;
				} else if((Arrays.binarySearch(thirty, mMonth)) > -1){
					current = 24;
				} else {
					current = 22;
				}
			}
		} else {
			current = 13;
		} 
		return findDate(day, current, count);
	}
	
	private DateTime findDate(int day, int current, int count){
		for(int i = current; i <= 31; i++){
			DateTime ref = new DateTime(mYear, mMonth, i, 0, 0);
			if(ref.getDayOfWeek() == day){
				if(count == 1){
					return ref;
				} else {
					count--;
				}
			}
		}
		
		return null;
	}
}
