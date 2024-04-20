public class AA02 {
    public static void main(String[] args) {
        try {
            System.out.println("Learn");
            int a = 20, b = 0, c;
            c = a / b;
            System.out.println("The value of c is : " + c);
            System.out.println("Like");

        } catch (Exception e) {
            int x = 20, y = 0, z;
            z = x / y;
            System.out.println("Z wala hai bhai" + z);
            System.out.println("Cannot not divide");
        }
        finally {
            System.out.println("Share  finally");
        }
        System.out.println("Main method is ended");
    }
}
