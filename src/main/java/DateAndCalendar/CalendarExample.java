package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        TimeZone timeZone=TimeZone.getTimeZone("Europe/Istanbul");
        System.out.println("Calendar in "+timeZone.getDisplayName()+ " time zone.");
        Calendar now=new GregorianCalendar(timeZone);
        System.out.println("ERA:  "+now.get(Calendar.ERA));
        System.out.println("YEAR:  "+now.get(Calendar.YEAR));
        System.out.println("MONTH:  "+now.get(Calendar.MONTH));
        System.out.println("DAY:  "+now.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: "+now.get(Calendar.DAY_OF_YEAR));

        Date date=now.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString=formatter.format(date);
        System.out.println("Date: "+dateString);
    }
}
