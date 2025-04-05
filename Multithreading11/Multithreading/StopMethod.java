package Multithreading;

public class StopMethod extends Thread{
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
        }
    }
}
class Example4 {
    public static void main(String[] args) {
        StopMethod t1 = new StopMethod();
        StopMethod t2 = new StopMethod();
        StopMethod t3 = new StopMethod();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t2.stop();  //Deprecated
        t3.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}

