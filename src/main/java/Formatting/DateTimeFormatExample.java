package Formatting;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
    public static void main(String[] args) {

        //Using ZonedDateTime
        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = dateTimeFormatter.format(ZonedDateTime.now(ZoneId.of("UTC")));
        System.out.println("Formatted Date time - " + formattedDateTime);

        //Using Instant
        dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
        Instant instant = Instant.now();
        String formattedInstant = dateTimeFormatter.format(instant);
        System.out.println("Formatted instant - " + formattedInstant);

        //Instant with Timezone
        dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.of("Asia/Kolkata")); //UTC would override timezone
        String formattedInstantWithTimeZone = dateTimeFormatter.format(Instant.now());
        System.out.println("Formatted instant with timezone - " + formattedInstantWithTimeZone);
    

    }
}
