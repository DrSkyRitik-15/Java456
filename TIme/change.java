import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class change {
    public static void main(String[] args) {
        LocalDateTime how = LocalDateTime.of(2024,5,2,10,55);
        System.out.println("Before " + how);
        LocalDateTime kow=how.minusDays(15);
        // how=how.minusDays(15);
        // LocalDate how=LocalDate.now();
        System.out.println("Before formatting ---" + kow);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        String dateAsAString = kow.format(dtf);
        System.out.println("After formatting  ---" + dateAsAString);
    }
}