import java.time.*;
import java.time.format.*;
import java.util.*;
public class T {
    public static void main(String[] args) {
        
        LocalDate time = LocalDate.of(2018,12,5);
        System.out.println("Local Date  : " + time);
        time=time.withDayOfYear(90);
        System.out.println("Print the time after 90 Days "+time);
    }
}
// String pattern = "yyyy-MM-dd";
// SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

// Date date = simpleDateFormat.parse("2018-09-09");