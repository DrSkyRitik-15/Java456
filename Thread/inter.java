import java.lang.*;
class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ritik");
        }
    }
}

public class inter {
    public static void main(String[] args) {
        A t1=new A();
        Thread T1=new Thread(t1);
        T1.start();
        //waiting for the thread to
        for (int i = 0; i <=5; i++) {
            System.out.println("Rock");
        }
    }
}
