import java.io.*;

class Fun implements Serializable{
    int id=310;
    String name="Java Programming ";
}

public class tryCatch{
    public static void main(String[] args){

        try{

            Fun s1=new Fun();
            FileOutputStream fout = new FileOutputStream("ff.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            System.out.println("Data written");
            //closing the output stream
            out.flush();
            out.close();
        }
        catch (Exception a) {
            }   System.out.println("Exception Occured while writing to file : "); 
          
        try{
            FileInputStream fis=new  FileInputStream("ff.txt");
            ObjectInputStream in=new ObjectInputStream(fis);
            Fun s2=(Fun)in.readObject();
            System.out.println("ID : "+s2.id+" Name: " +s2.name);

            in.close();

        }
        catch(Exception e)
        {
            System.out.println("......... Error ....... ");
        }

    }
    
}



    