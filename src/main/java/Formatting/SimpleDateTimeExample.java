package Formatting;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDateTimeExample {
    public static void main(String[] args) {
        String pattern1 = "yyyy-MM-dd'T'HH:mm:sXXX"; //with timezone - 2025-08-16T00:17:14+05:30
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);

        Date date = new Date();
        String formattedDate = sdf.format(date);
        System.out.println("Formatted date - "+formattedDate);

        String pattern2 = "yyyy-MM-dd'T'HH:mm:ss'Z'"; //Zulu time representation - no timezone information.
        sdf.applyPattern(pattern2);
        String formattedDate2 = sdf.format(date);
        System.out.println("Second formatted date - "+formattedDate2);

        // Obtaining UTC time from Date - 
        sdf.setTimeZone(TimeZone.getTimeZone("UTC")); //Overrides the format to Zulu time format.
        String utcTimeStampInZuluFormat = sdf.format(date);
        System.out.println("UTC timestamp in Zulu time format - "+utcTimeStampInZuluFormat);

        sdf.applyPattern(pattern1);
        String utcTimeStampWithTimeZone = sdf.format(date);
        System.out.println("UTC Timestamp with timezone information - "+ utcTimeStampWithTimeZone);


    }
}
