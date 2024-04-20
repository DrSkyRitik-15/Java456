import java.time.*;
public class getDayOfWeek {

    
    public static void main(String[] args) {
        String Str1="2024-03-21";    // ye date ka formate yaad rakhna 
        LocalDate Date=LocalDate.parse(Str1); // only [parse] hoga 
        System.out.println("Date se getDayofWeek by Stirng : "+Date.getDayOfWeek());  // thusday
    }
}






