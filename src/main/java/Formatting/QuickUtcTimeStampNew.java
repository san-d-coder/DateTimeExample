package Formatting;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class QuickUtcTimeStampNew {
    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.of("UTC"));
        String formattedUtcTimeStamp = dateTimeFormatter.format(Instant.now());
        System.out.println("Formatted UTC timestamp - "+formattedUtcTimeStamp);
    }
}
