import java.text.DateFormat;
import java.util.Date;
public class iimp {
    public static void main(String[] args) {
        Date abc=new Date();
        System.out.println("Current date and time is : " + DateFormat.getDateTimeInstance().format(abc)); //showing different
        
       
        System.out.println("Current date "+abc);
        String datetoStr=DateFormat.getInstance().format(abc);  // showing different
        System.out.println("date formate using instance  " +datetoStr);

    }
}
