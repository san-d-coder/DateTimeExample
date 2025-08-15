package Core;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today - " + today);

        //LocalDate operations - 
        LocalDate tomorrow = today.plusDays(1);
        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        //Output
        System.out.println("Tomorrow - " + tomorrow);
        System.out.println("Last month - "+ lastMonth);
        System.out.println("Next Year - " + nextYear);
    }
}
