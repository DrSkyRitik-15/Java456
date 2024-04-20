import java.lang.*;
class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ritik");
        }
    }
}

public class f01 {
    public static void main(String[] args) {
        A t1=new A();
        t1.start();
        //waiting for the thread to
        for (int i = 0; i <=5; i++) {
            System.out.println("Rock");
        }
    }
}
