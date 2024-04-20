
public class lambda{
    public static void main(String[] args) {
       Runnable r1= () -> {System.out.println("Hello World"); };
       Thread T1=new Thread(r1);
       T1.start();
        //waiting for the thread to
        for (int i = 0; i <=5; i++) {
            System.out.println("Rock");
        }
    }
}
