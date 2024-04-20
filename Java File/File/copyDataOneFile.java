import java.io.*;

public class copyDataOneFile {
    public static void main(String[] args) throws IOException{
        FileInputStream F1=new FileInputStream("C:\\Users\\DELL\\Desktop\\Java File\\File\\DFG.txt");
        FileOutputStream W=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Java File\\File\\OLA.txt");
        int i ;
        while ((i=F1.read())!=-1) {
            W.write((char)i);
        }
        System.out.println( "The file has been copied successfully!");

    }
}
t