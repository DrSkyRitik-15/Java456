import java.time.*;
public class isLeapyear {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.of(2024,05,4);
        System.out.println("Check = "+d1.isLeapYear());
        LocalDate d2=LocalDate.of(2017,05,4);
        System.out.println("Check = "+d2.isLeapYear());
    }
}
