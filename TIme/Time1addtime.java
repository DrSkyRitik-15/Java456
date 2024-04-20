import java.time.*;
public class Time1addtime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(8,43, 30); 
        System.out.println("Original Time: " + time);  
        LocalTime t2=time.plusHours(4);
        System.out.println("Adding 4 hours to the original time gives :" +t2);    

        LocalTime t3=time.plusMinutes(69);
        System.out.println("Adding 69 minutes to the original time gives :"+t3);
        LocalTime t4=time.minusMinutes(69);
        System.out.println("Subtracting 69 minutes from the original time gives : "+t4);
        LocalTime t5=time.minusSeconds(69);
        System.out.println("Subtract    ing 69 seconds from the original time gives : "+t5);

    }
}
