import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate tommorrow = yesterday.plusDays(2);
        LocalDate nextday = today.plusDays(1);
        System.out.println("Yesterday date is: " + yesterday);
        System.out.println("Next  date is : " + nextday);
        System.out.println("Today is: " + today);
        System.out.println("Tomorrow date is : " + tommorrow);
    }
}
