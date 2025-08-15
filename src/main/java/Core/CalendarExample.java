package Core;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // System.out.println("Calendar Instance - " + calendar);
        Date currentTimeFromCalendarInstance = calendar.getTime();
        System.out.println("Current time from calendar instance - "+ currentTimeFromCalendarInstance);

        System.out.println("Calendar Date - "+Calendar.DATE);
        
        
    }
}
