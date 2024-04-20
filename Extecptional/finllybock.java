public class finllybock {
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a = 10, b = 2, c;
        try {
            c = a / b;

            System.out.println(c);
        } catch (Exception e) {
          
            System.out.println("Cannot divide by Zero");
         
        }
        finally{
            System.out.println("You can Share code");
        }
        System.out.println("main method ended");
    }
}
