package Multithreading;

public class SuspendAndResume extends Thread{
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
class Example2 {
    public static void main(String[] args) {
        SuspendAndResume t1 = new SuspendAndResume();
        SuspendAndResume t2 = new SuspendAndResume();
        SuspendAndResume t3 = new SuspendAndResume();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
//        t2.suspend();
//        t2.resume();
        t3.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}

