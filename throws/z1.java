// package throws;

public class z1 {
    public static void main(String[]args)throws Exception
    {
        int balance=100;
        balance=balance-100;
        if(balance==0)
            // throw new ArithmeticException("Hello world");
            throw new Exception("Balance cannot be less than zero");
        
    }
}
//  OR   //
// public class z1 {
//     public static void main(String[]args)
//     {
//         int balance=100;
//         balance=balance-100;
//         if(balance==0)
//             throw new ArithmeticException("Hello world");
//

//     }
// }
