import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class plusDayformate {
    public static void main(String[] args) {
        LocalDateTime how = LocalDateTime.of(2024, 5, 2, 10, 55);
        System.out.println("Before " + how);
        LocalDateTime kow = how.plusDays(15);

        System.out.println("Before formatting ---" + kow);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm ");

        String dateAsAString = kow.format(dtf);
        System.out.println("After formatting  ---" + dateAsAString);
    }

}

