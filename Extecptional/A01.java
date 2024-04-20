public class A01 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a=10,b=0,c;
        c=a/b;
        System.out.println(c); // This will cause ArithmeticException:
        System.out.println("main method ended");
    }
}
