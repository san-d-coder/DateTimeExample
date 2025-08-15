package Core;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
        System.out.println("Current local date time in UTC: "+dateTime);
    }
}
