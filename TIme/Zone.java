// import java.time.ZoneId;
import java.time.*;
class Zone{
    public static void main(String[] args) {
        
    
    ZoneId z1=ZoneId.of("Asia/Kolkata");
    ZoneId z2=ZoneId.of("Europe/Paris");
    LocalTime t1= LocalTime.now(z1);
    LocalTime t2= LocalTime.now(z2);
    System.out.println(t1);
    System.out.println(t2);
    
    System.out.println("--------------------------- isBefore");
    System.out.println(t1.isBefore(t2));

    System.out.println("--------------------------- is After");
    System.out.println(t1.isAfter(t2));
    
    }
}
//     public static void main(String[] args) {
//         for (String  var : ZoneId.getAvailableZoneIds()) {
//             System.out.println(var);
//         }
//     }
// }