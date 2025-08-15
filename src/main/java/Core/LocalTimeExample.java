package Core;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time now - "+localTime); //System time.
        LocalTime utcLocalTime = LocalTime.now(ZoneId.of("UTC"));
        System.out.println("UTC localtime - " + utcLocalTime); //UTC local time
    }
}
