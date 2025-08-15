package Core;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Default format - " + currentDate);

        String format = "yyyy-MM-dd'T'hh:mm:sXXX";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String formattedDate = simpleDateFormat.format(currentDate);

        System.out.println("With timestamp - "+formattedDate);

        try {
            Date parsedDate = simpleDateFormat.parse(formattedDate);
            System.out.println("Parsed date - "+parsedDate);
        } catch (ParseException e) {
            System.out.println("Exception occurred - "+e.getLocalizedMessage());
        }
        
    
    }
}
