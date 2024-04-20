import java.io.Console;

import java.io.*;
class A01{
 public static void main(String[] args) {
    String str;
    char ch[];
    Console obj=System.console();
    System.out.println("Enter the Username");
    str =obj.readLine();
    System.out.println("Enter the  Password");
    ch=obj.readPassword() ;

    
    
    // Printing username and password
    System.out.print("\nUsername : "+str);

    
    System.out.println("\nPassword = "+ch);
    //    System.out.println("\nPassword = "+new String(ch));// for  displaying password in plain text
    // or
    String b=String.valueOf(ch);
    System.out.println("\nPassword = " + b);
    
}
}