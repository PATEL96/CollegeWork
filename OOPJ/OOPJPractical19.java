import java.lang.*;

class display implements Runnable {
    public void run() {
        for(int k=0;k<2;k++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("I'm Thread1"); }
        }
}


public class OOPJPractical19 extends Thread {
    public void run() {
        for(int l=0;l<2;l++) {
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("I'm Thread2");
        }
    }

    public static void main(String args[]) {
        display a1 = new display();
        Thread b1 = new
        Thread(a1);
        b1.start();
        OOPJPractical19 a2 = new OOPJPractical19();
        Thread b2 = new Thread(a2);
        b2.start();
    }
}
