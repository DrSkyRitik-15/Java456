
// package File2;
import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("File1.txt");
        f1.createNewFile();
        PrintWriter pw = new PrintWriter(f1);

        String s = "Hello World!";
        pw.println(s);
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++)
            pw.println(i + ": " + s);
        pw.close();


        File f2 = new File("File1.txt");
        FileReader br=new FileReader(f2);

int  line = br.read();
while (line != -1) {
    System.out.print((char)line);
    line = br.read();
}

br.close();

    }
}
