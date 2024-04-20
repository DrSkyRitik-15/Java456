// import java.io.IOException;
import java.io.File;
import java.io.IOException;

/**
 * Delete
 */
public class Delete {

    public static void main(String[] args)throws IOException {
        File F=new File("C:\\Users\\DELL\\Desktop\\Java File\\File\\Abc.txt");
        if (F.delete()) {
            System.out.println("File is delete = "+F.getName());
            
        }
        else{
            System.out.println("Unexpected error");
        }
    }
}