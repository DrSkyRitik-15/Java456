public class E01 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a = 10, b = 0, c;
        try{
        c = a / b;

        System.out.println(c);
        }
        catch(Exception e)
        {
            // System.out.println(e);
            // or 
            System.out.println("Cannot divide by Zero");
            // System.out.println(c);  // error
        }
        System.out.println("main method ended");
    }
}
