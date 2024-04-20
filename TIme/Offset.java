// import java.time.*;
import java.time.OffsetTime;
public class Offset {
    public static void main(String[] args) {
        OffsetTime time = OffsetTime.now();
        int m=time.getMinute();
        System.out.println(m+" minute");
    }
}
