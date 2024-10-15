package DateAndCalendar;

import java.util.TimeZone;

public class TimeZoneExample {
    public static void main(String[] args) {
        System.out.println("All available time zones.");
        String[] timeZones= TimeZone.getAvailableIDs();
        System.out.println("Number of available timezones: " + timeZones.length);
        for (String timeZone : timeZones) {
            System.out.println(timeZone);
        }
    }
}
