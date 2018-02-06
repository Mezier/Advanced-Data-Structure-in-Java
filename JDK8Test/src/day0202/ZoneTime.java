package day0202;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTime {
  public static void main(String[] args) {
	ZonedDateTime z=ZonedDateTime.now();
	System.out.println(z);
	ZoneId id=ZoneId.systemDefault();
	System.out.println(id);
}
}
