import java.time.*;
public class question {
    public static void main(String[] args) {
        
        LocalDateTime t1=LocalDateTime.now();
        System.out.println("Today date and time : "+t1);
        LocalDateTime t6=t1.plusDays(1);
        System.out.println("Time of next date "+t6);
        
        
        
    }
    
    
    
    
}







// LocalDate today=LocalDate.now();
// System.out.println("Today date is = "+today);
// LocalTime t1=LocalTime.now();
// System.out.println("Time is today is "+t1); 
// LocalDate tommar=today.plusDays(1);

// System.out.println("Tommaro date is "+tommar);
// LocalTime t2=t1.plusHours(24);