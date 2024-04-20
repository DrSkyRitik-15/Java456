import java.io.File;

public class Rename {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\DELL\\Desktop\\Java File\\File\\Abc.txt");
        File n=new File("C:\\Users\\DELL\\Desktop\\Java File\\File\\DFG.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(n));
        }
        else{
            System.out.println("...........Done............");
        }
    }
}
