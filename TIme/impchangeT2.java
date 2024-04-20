import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class impchangeT2 {
    public static void main(String[] args) {
      LocalDateTime how=LocalDateTime.now();
      // LocalDate how=LocalDate.now();
      System.out.println("Before formatting ---"+how);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
      // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
      String dateAsAString =how.format(dtf);
      System.out.println("After formatting  ---"+dateAsAString);
    }
}
