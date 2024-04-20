import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\Java File\\File\\Abc.txt");

            try{
                int i;
                // int i=f.read();
                while((i=f.read())!=-1){         // ye aise hi rahega
                    System.out.print((char)i);
            }
            }finally{
                System.out.println( "\nThis is finally block" );
                f.close();
            }
        } catch (IOException e) {
       System.out.println("Exectopm handle");
    }
}
}