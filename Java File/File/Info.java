// package File;

import java.io.*;

public class Info {
    public static void main(String[] args) {
        File F1 = new File("c:\\Users\\DELL\\Desktop\\Java unit 456\\File\\Abc.txt");
        
        if(F1.exists()) {
            System.out.println("The file name = "+F1.getName()); 
            System.out.println("The file path name = "+F1.getAbsolutePath()); 
            System.out.println("File writeable = "+F1.canWrite());  
            System.out.println("File Readable = "+F1.canRead());  
            System.out.println("File Size = "+F1.length()+" bytes");
    }
    else{
        System.out.println("This file does not exist.");
    
}

}
}
