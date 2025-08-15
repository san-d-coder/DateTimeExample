package Formatting;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FormatOverride {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = "yyyy-MM-dd'T'HH:mm:ssXXX";
        sdf.applyPattern(format);
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        formattedDate = sdf.format(date); //Overrides the format.
        System.out.println(formattedDate);
    }
}
