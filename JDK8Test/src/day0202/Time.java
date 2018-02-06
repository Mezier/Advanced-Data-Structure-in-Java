package day0202;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Time {
   public static void main(String[] args) {
	/*Calendar ca=Calendar.getInstance();
	System.out.println(ca.getTime());
	System.out.println(ca.get(Calendar.YEAR));
	System.out.println(ca.get(Calendar.MONTH));  //0-11
	System.out.println("--------(before jdk7, now is jdk8");
	LocalDateTime loc=LocalDateTime.now();
	System.out.println(loc.getYear());
	System.out.println(loc.getMonthValue());//1-12
	System.out.println(loc.getHour());
    System.out.println("----get time from 01/01/1970(three methods)--");
    System.out.println(Calendar.getInstance().getTimeInMillis());

    System.out.println(System.currentTimeMillis());

    System.out.println(Clock.systemDefaultZone().millis());
    System.out.println("---get the last day of this month---");
    LocalDate first=LocalDate.of(loc.getYear(), loc.getMonth(), 1);
    LocalDateTime last=loc.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println("the first day :"+first);
    System.out.println("the last day:" +last);
    System.out.println("---format---");
    DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(loc.format(df));
    System.out.println("---the current time of yesterday---");
    LocalDateTime yester=loc.minusDays(1);
    System.out.println(yester);*/
	   LocalDateTime curr=LocalDateTime.now();
	   LocalDate date1=LocalDate.now();
	   LocalDate d1=curr.toLocalDate();
	   System.out.println(curr);
	   System.out.println(d1);
	   LocalDate firstIn = LocalDate.of(date1.getYear(),date1.getMonth().getValue()+1, 1);
       System.out.println(firstIn);
       LocalDate secondSaturday = firstIn.with(TemporalAdjusters.nextOrSame(
    	         DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
       System.out.println(secondSaturday);
   }
}
