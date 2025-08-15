package Core;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant - " + instant); //Always UTC
    }
}
