
// public class threadsleep {
//     public static void main(String[] args) {
//         for (int i = 0; i <  10; i++) {
//             System.out.println(i);

//             Thread.sleep(1000); // Delay of 1 second
            
//         }
//     }
// }

public class threadsleep {
    public static void main(String[] args)throws InterruptedException
     {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000); // Delay of 1 second

        }
    }
}
