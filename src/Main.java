import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by KPS on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND));
        System.out.println();
    }
}
