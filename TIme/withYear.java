import java.time.*;
public class withYear {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.parse("2014-09-15");
        LocalDate result=d1.withYear(2024);
        LocalDate resultmonth=d1.withMonth(2);
        LocalDate resultday=d1.withDayOfMonth(5);
        System.out.println("The Date with year is: "+result);
        System.out.println("The Date withMonth is: "+resultmonth);
        System.out.println("The Date withDayOfMonth is: "+resultday); /// special format hai 
        System.out.println("The Date isLeapYear or not : "+result.isLeapYear());
    }
}
