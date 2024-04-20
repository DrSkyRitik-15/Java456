import java.io.*;

public class Question {
    public static void main(String[] args) throws IOException {
        int counter = 1;
        File f = new File("Pola.txt");

        if (f.createNewFile()) {
            System.out.println("File is created");
        } else {
            while (true) {
                File obj2 = new File("Pola.txt"+ counter); // creating new file with incremented name
                if (obj2.createNewFile()) {
                    System.out.println("File " + counter + " is created");
                    break;
                } else {
                    System.out.println("--Not created--");
                }
                counter++;
            }
        }

    }
}
