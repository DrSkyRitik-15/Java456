

/**
 * j01
 */
public class j01 {

    public static void main(String[] args) {
        try{
            try {
                int a[]={1,2,3};
                System.out.println("a[4]= "+a[4]);
            } catch (Exception e) {
                System.out.println("index more  than array size");
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }

        System.out.println(".............End of program...........");

    }
    
}