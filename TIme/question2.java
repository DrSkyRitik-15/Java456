
import java.time.*;
public class question2 {
    
        public static void main(String[] args) {
            LocalDate d1=LocalDate.of(2018,2,15);
            System.out.println("before : = "+d1.getYear());
            // d1=d1.plusYears(10);
            // LocalDate t1=d1.plusYears(10);   // same 
            System.out.println("Leap or not  "+d1.isLeapYear());
            System.out.println("Leap or not  "+d1.getDayOfWeek());
        }
    } 

