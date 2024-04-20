import java.io.*;

public class Wrote {
    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("C:\\Users\\DELL\\Desktop\\Java File\\File\\Abc.txt");

        try {
            

            f.write("Hello every one "); //

        } finally {
            System.out.println("Data insereted");
            f.close(); // closing the file after writing data into
        }
    }
}
