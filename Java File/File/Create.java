// package File;
import java.io.*;
public class Create {
    public static void main(String[] args) {
        File F1=new File("C:\\Users\\DELL\\Desktop\\Java File\\File\\Abc.txt");  // file bnaane ka tarika
        try{
        if(F1.createNewFile())
        {
            System.out.println("New file Create");
        }
        else{
            System.out.println("Not create");
        }
    }
    catch (IOException e) {
        System.out.println("Exception Occurred"+e);
    }
}
}
