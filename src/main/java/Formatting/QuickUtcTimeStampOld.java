package Formatting;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class QuickUtcTimeStampOld {
    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String formattedDate = sdf.format(new Date());
        System.out.println("Formatted date - "+formattedDate);
    }
}
