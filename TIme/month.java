import java.time.*;
public class month {


    public static void main(String[] args) {
        String Str1="2004-09-15";    // ye date ka formate yaad rakhna 
        LocalDate Date=LocalDate.parse(Str1); // only [parse] hoga 
        System.out.println("Date se month by Stirng : "+Date.getMonth());  // SEPTEMBER
    }
}


