import java.util.*;
public class Difer {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ritik");
        list.add("Ritik1");
        list.add("Ritik2");
        list.add("Ritik3");
        list.add("Ritik4");

        list.forEach(element->System.out.println(element));
        // list.forEach((element)->System.out.println(element));
        
    }
}
